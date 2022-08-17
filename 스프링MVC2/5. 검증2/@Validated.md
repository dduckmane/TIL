@Validated는 결국에는 rejectValue와 같다.

1. 바인딩 성공 시 작용(type이 안맞을 시(바인딩 실패시)에는 스프링이 처리,)
2. bindingresult의 데이터를 이용해서 Bean Validation에 맞게 검증을 한다.
3. 만약 검증 실패시
4. bindingresult.rejectvalue와 같은 일을 한다.=에러를 만들고 필드명, 에러코드, 파라미터, 기본 메시지를 넣어준다.
5. 에러코드의 이름은 Bean Validation의 이름을 바탕으로 만들어진다. ex) NotNull, Range등--> NotNull.item.itemNam, NotNull.java.lang....등등
6. 그 후에는 resolver가 작용해서 에러코드를 이용해서 에러코드 배열을 만든다.
7. new fielderror를 만들게 된다.
8. 타암리프에서 th:errors가 실행이 되면 messagesource가 작용해서 메시지를 찾는다.
