결론: 진짜 객체 조회를 꼭 필요한 시점까지 지연처리하기 위해서 DL을 사용한다.

1. 빈은 생성자와 초기화 메서드가 분리가 되어 있다.
2. 기본 라이프 사이클을 보면

빈이 모두 등록이 되고 의존관계가 자동주입이 되고 초기화 메서드까지 일어난다.

그래서 함수를 사용할려고 한다면 그 때는 이미 등록부터 초기화까지 모두 일어났다.

하지만 의존관계는 가지고 있으나 함수가 실행이 되고 그 다음에 필요한 빈이라면

그 때까지 지연처리를 해야한다.

그 때 사용이 되는 것이 DL이다.

