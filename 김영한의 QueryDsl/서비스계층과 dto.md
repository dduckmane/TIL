- 서비스에는 엔티티만 의존하는 것이 좋다.--> 그래야 재사용성이 높아진다.
- 컨트롤러는 dto를 의존하는 곳이고 dto변환을 컨트롤러에서 하는 것이 좋다.
- 하지만 그러면 너무 로직이 많아질 수 있다.
- 그러면 dto용 즉 화면용 서비스페키지를 따로 만들면 된다.
