![image](https://user-images.githubusercontent.com/108928206/181247163-4623757c-7b06-4db7-bfba-25604d7c67ab.png)
![image](https://user-images.githubusercontent.com/108928206/181247190-9d848ea0-8a82-4280-8753-d432022d28ca.png)

ApplicationContext는 스프링 빈을 관리하고 조회하는 것을 상속받고 부가적인 기능을 해준다.

![image](https://user-images.githubusercontent.com/108928206/181247370-ffca54c1-2359-4f84-8e8f-0eb33d35c4fb.png)

AnnotationConfigApplicationContext는 자바기반 AppConfig를 빈으로 등록해준다.

저 3가지의 구현체들의 공통점은 ApplicationContext즉 스프링 컨테이너에게

BeanDefinition을 주는 역할을 하고 그거에 따른 구현체 들이다.

![image](https://user-images.githubusercontent.com/108928206/181247765-3d572411-dfc6-4247-88b9-f0f1acb076c5.png)

[BeanDefinition]

![image](https://user-images.githubusercontent.com/108928206/181247849-56d7d3d9-fca3-4746-925b-1d94eb4434da.png)

이러한 정보들 bean에 관한 정보들을 스프링 컨테이너에게 준다.

