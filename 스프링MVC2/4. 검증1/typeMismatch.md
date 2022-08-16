타입이 맞지 않을 때는 스프링에서 직접 해결

1. 타입이 맞지 않음--> BindingResult에서 오류 결과를 가지고 있음
2. 스프링이 직접 검증 오류에 추가-->typeMismatch 라는 오류 코드를 사용
3. MessageCodesResolver 를 사용해서 검증 오류 코드로 메시지 코드들을 생성
4. th:erros 에서 메시지 코드들로 스프링에서 제공하는 메시지소스(MessageSource)를 사용해서
5. errors.properties에 접근 후
6. 메시지를 순서대로 찾고, 노출
