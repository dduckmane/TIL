![image](https://user-images.githubusercontent.com/108928206/191755522-796e0338-185c-4758-9038-cc222eae2b35.png)

1. 엔티티 매니저 팩토리는 하나만 생성
2. 엔티티 매니저는 쓰레드간에 공유X 한 트렌젝션에 1개만 있다.
3. JPA의 모든 데이터 변경은 트랜잭션 안에서 실행된다.
