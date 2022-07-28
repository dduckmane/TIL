
[Component란]

스프링 컨테이너에 빈으로 등록이 되어서 싱글톤유지가 되는 녀석이다.

[빙법1. 컴포넌트 스켄]

![image](https://user-images.githubusercontent.com/108928206/181503625-4067dae5-2b96-450c-9597-6a5ae307fe27.png)

1. 컴포넌트로 등록을 할려면 ComponentScan를 해야한다.
2. 해당 페키지의 @Component붙은 놈들을 Componet로 등록을 시킨다.

[방법2. 클래스를 파라미터로 전달]

![image](https://user-images.githubusercontent.com/108928206/181504233-3346266d-4f23-4298-9898-8464d097d16d.png)

이런식으로 전달하는 순간 Component가 된다.

[방법3. Bean과 Configuration]

![image](https://user-images.githubusercontent.com/108928206/181504521-761ede2f-e949-4390-a74b-31dc3fdda0ae.png)

![image](https://user-images.githubusercontent.com/108928206/181504541-d8716644-0af4-4c2a-a1dc-c196d2d768fb.png)

1. 주로 수동으로 관리 해줄때 사용
2. Appconfig를 넘겨주면 Appconfig는 빈으로 등록되지만 메서드들은 빈으로 등록되지 못한다.
3. @Bean으로 등록을 해주고 싱글톤 유지를 위해 @Configuration를 붙여주면 CGLB기술을 통해 싱글톤으로 관리를 해준다.
