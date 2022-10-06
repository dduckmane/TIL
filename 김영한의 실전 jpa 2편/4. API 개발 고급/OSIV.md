[spring.jpa.open-in-view:false의 문제점]

![image](https://user-images.githubusercontent.com/108928206/194190057-ab3347c1-758c-45e5-b87a-9a65986d8eb6.png)

이 로직을 봤을 때 여기서 osiv를 끄면

![image](https://user-images.githubusercontent.com/108928206/194190129-9676dfdd-af42-4b0a-aebd-71cec442f790.png)

여기서 프록시를 강제 초기화를 시켜줘야하는 데

커넥션을 반환했기 때문에

![image](https://user-images.githubusercontent.com/108928206/194190175-d0d3d7ca-2c4a-46d1-8836-6ce427d7b894.png)

초기화 하지 못한다고 에러가 뜬다.

![image](https://user-images.githubusercontent.com/108928206/194190866-04bdfe93-e620-498f-9552-8f0a0b3aa2ce.png)

여기서도 컨트롤러에서 dto로 변환시에도 dto안에 강제초기화메서드가 있기 때문에 에러가 난다.

[해결방안]

- 패치조인을 사용하거나 프록시 강제 초기화를 서비스 로직안으로 넣어야한다.
- 지금까지의 controller에서 강제초기화로직을 모두 서비스안으로 가져간다. 대신 쿼리용 페키지를 만든다.

    OrderService
    
      OrderService: 핵심 비즈니스 로직

      OrderQueryService: 화면이나 API에 맞춘 서비스 (주로 읽기 전용 트랜잭션 사용)

      --> 이러면 dto도 다 서비스에 녹이면 된다. queryservice안에서도 dto넣고
  
