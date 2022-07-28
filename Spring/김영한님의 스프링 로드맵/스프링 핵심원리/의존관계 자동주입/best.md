의존관계 주입은 크게 4가지 방법이 있다.

1. 생성자 주입
2. 수정자 주입(setter 주입)
3. 필드 주입
4. 일반 메서드 주입

여기서 결론은 생성자 주입을 가장 많이 쓰고 권장한다.

[이유]

1. final를 사용할 수가 있다--> 불변,필수가 가능하다.
2. 생성자가 딱 1개만 있으면 @Autowired를 생략해도 자동 주입 된다.
3. 롬복과 최신 트랜드를 사용할 수가 있다.

![image](https://user-images.githubusercontent.com/108928206/181508589-25d71d29-8807-4f58-bad5-ba2ba800a414.png)

![image](https://user-images.githubusercontent.com/108928206/181508625-72b70148-f373-4ecd-9f20-f85cde7c4817.png)

![image](https://user-images.githubusercontent.com/108928206/181508673-51389aa0-5a69-4dfd-b533-0794c51e90d7.png)
