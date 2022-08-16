1. Validator 인터페이스를 상속 받은 컴포넌트를 하나 만들고
2. 자동 의존관계 주입을 한다.
3. @InitBinder를 이용해서 WebDataBinder에 내가 만든 validator를 넣는다.
4. 사용할 컨트롤러에서 @Validated를 추가한다.
5. @Validated가 support로직를 실행시키고 해결할 수 있으면 validator가 실행이 된다.
