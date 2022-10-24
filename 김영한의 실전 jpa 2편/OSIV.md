## [결론]

- 성능을 위해 OSIV를 끄자
- 끄면 @Transactional이 없는 곳에서 지연로딩을 실행하지 못한다.
- 그 말은 즉슨 리포와 서비스를 제외하면 모든 곳에서는 지연로딩을 실행하지 못한다.
- 즉 컨트롤러나 뷰에서는 모두 fetch join이나 초기화가 된 엔티티만 사용해야한다.

## [이유]

![image](https://user-images.githubusercontent.com/108928206/197557105-1a7d060f-3ee7-47bd-91db-94203edca9ff.png)

- 그림을 보면 db와 연결하는 애는 영속성 컨텍스트이다.
- 지연로딩이란 영속성 컨텍스트에서 있으면 실제 엔티티를 주고 없으면 프록시를 주는 것이다.
- 근데 보통 영속성 컨텍스트에는 없으니까 프록시를 준다.
- 그럼 프록시는 초기화가 될 때 jpql이 나가야한다.
- jpql은 영속성 컨텍스트가 담당한다.
- 그러므로 영속성 컨텍스트가 없다면 jpql이 못나가므로 프록시가 초기화가 안된다.
- osiv를 끄면 영속성 컨텍스트는 컨트롤러나 뷰에는 없으므로 프록시가 초기화 되지 못한다.
- transactional이 없어도 jpql은 나가네??
  
  ### [@Transactional이 없어도 jpal이 나가는 이유]
  
    - osiv를 키면 데이터 베이스 커넥션이 유지된다.
    - ![image](https://user-images.githubusercontent.com/108928206/197566694-0fb995f7-e42a-4578-93b0-c29a7cc87c4b.png)
    
    - 트렌젝션 하나당 영속성 컨텍스트는 하나다.
    - findById는 jpaRepository꺼기 때문에 @Transactional이 붙어있고 이상태에서 osiv를 키면 베이스 커넥션이 유지되서
    - 컨트롤러같이 트렌젝션이 없는 곳에도 데이터 베이스 커넥션이 유지되면서 jpql이 나갈 수가 있따.
      
      ![image](https://user-images.githubusercontent.com/108928206/197567335-53f78943-58c4-477f-a975-b46e2ba891f0.png)
        
        
      

## [실습]

![image](https://user-images.githubusercontent.com/108928206/197558940-6642a157-7d49-433b-9d48-2e1ee4775971.png)

osiv가 키면 정상 작동


#### (끄면)

![image](https://user-images.githubusercontent.com/108928206/197559059-bd317ed9-1e2b-4a33-91d2-c015f5c9d461.png)

에러
