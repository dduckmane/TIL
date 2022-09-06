[JDBC 등장 전]

![image](https://user-images.githubusercontent.com/108928206/188532211-11677bc1-3386-4c70-a658-bb79a5c95742.png)

연결, SQL전달, 결과응답

[JDBC 등장]

![image](https://user-images.githubusercontent.com/108928206/188532265-befa8ac4-b27c-4cff-b6e6-1efc84f6fb8a.png)

드라이버의 등장으로 DB가 바뀌어도 드라이버만 바꾸면 된다.

  --> 연결코드를 바꾸지 않아도 된다. 하지만 SQL은 바꿔야 한다.
  
[JDBC 코드]

1) 연결

![image](https://user-images.githubusercontent.com/108928206/188532462-e6db6edd-7b3b-4873-b39a-fab1bf27eaf4.png)

![image](https://user-images.githubusercontent.com/108928206/188532470-4ab13b09-3ef3-4829-ae97-caac37d499f6.png)

--> 라이브러리에 있는 데이터베이스 드라이버가 작동--> 커넥션을 맺고 커넥션을 반환--> 이제 커넥션을 이용가능

2) 쿼리 전달

  -쿼리 설정
    
    String sql = "insert into member(member_id, money) values(?, ?)";
    
    PreparedStatement pstmt = null;
    
    pstmt = con.prepareStatement(sql); --> 커넥션에 SQL을 집어 넣어준다.
    
   -파라미터 설정
   
    pstmt.setString(1, member.getMemberId());
    
    pstmt.setInt(2, member.getMoney()); --> ?로 코드를 작성하고 집어넣어줘야 SQL인젝션 공격을 막을 수가 있다.
    
 3) 실행
  
   pstmt.executeQuery(); OR pstmt.executeUpdate();
   
 4) 결과 받음

  ![image](https://user-images.githubusercontent.com/108928206/188532948-a00c6949-07e1-44b2-9415-58e4a4e394a0.png)

  RESULTSET에 결과를 받아서 꺼내서 객체에 집어넣어준다.
  
  주의 사항: 커서를 이동시켜주어야 한다. 처음 커서는 데이터를 가르키고 있지 않다. --> re.next()
  
5) close

  연결과 stmt resultset 모두 닫아주고 예외 처리를 해줘야함
  

  
    
    
    

