- 생성자에서 초기화되지 않을 때--> get으로 끄낼 수가 잇다.
- null이 터질때 해결방안으로 예외를 던질 수가 있는데 그러면 자바는 stacktrace를 찍고 그 자체가 리소스를 소모하는 것이다.
  
  - 예외는 진짜로 필요한 경우에만 사용해야한다.

- repository에서 service나 service에서 controller로 즉 서버에서 클라이언트로 null을 줄 수 있는 상황일때 알려주기 위해서  optional이 생겼다.
- 
