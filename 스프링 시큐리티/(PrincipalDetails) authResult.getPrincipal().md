(내 생각)

- 클라이언트의 세션id로 서버는 인증을 한다.
- 그 때 서버의 authentication영역에는 많은 클라이언트의 키값쌍이 있겠지만
- 해당요청 클라이언트의 authentication을 꺼내주는 것이
- (PrincipalDetails) authResult.getPrincipal()이다.
- 그리고 이미 시큐리티권한url처리로 뚫고 들어왔다는 거 자체가 authentication객체가 있다는 것이므로 nullchech를 안해줘도 된다.
