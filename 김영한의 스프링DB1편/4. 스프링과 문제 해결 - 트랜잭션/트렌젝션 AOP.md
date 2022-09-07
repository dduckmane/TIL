[트랜잭션 AOP]

![image](https://user-images.githubusercontent.com/108928206/188761127-c21f5125-0c7e-4bff-b99e-cb23b508179a.png)

[트랜잭션 프록시 코드 예시]

![image](https://user-images.githubusercontent.com/108928206/188761232-5a7fcfa6-ab01-4940-9b46-3c6724919505.png)

-@Transactional를 붙이면 프록시가 생겨서 커넥션 연결, 로직실행, 커밋, 롤벡 다 해준다.

-프록시에서 트렌젝션 메니저를 사용하고 트렌젝션 메니저는 데이터 소스를 사용한다. 참고로 데이터 소스는 드라이버를 통해 커넥션이 다 연결 되어 있다.

-스프링에서 자동으로 DataSource와 TransactionManager를 다 등록해준다.

결론: @Transactional를 붙이면 프록시가 트렌젝션메니저를 이용해서 트렌젝션관리를 알아서 다 해준다.
