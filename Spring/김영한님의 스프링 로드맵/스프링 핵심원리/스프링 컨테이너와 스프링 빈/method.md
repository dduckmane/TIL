//스프링 컨테이너 생성

ApplicationContext applicationContext =new AnnotationConfigApplicationContext(AppConfig.class);

//빈 타입들 확인
String[] beanDefinitionNames = ac.getBeanDefinitionNames();

//getBean

![image](https://user-images.githubusercontent.com/108928206/181250025-f4b8dfbc-a6d7-4abd-be2d-4d85bdfab1ab.png)

![image](https://user-images.githubusercontent.com/108928206/181250040-897ed4a7-653c-48f3-8196-9690f8fd29c7.png)


// 빈의 정보가 나온다.(직접 등록한 빈인지 스프링 내부에서 사용하는 빈인지)

BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinitionName);

Role ROLE_APPLICATION: 직접 등록한 애플리케이션 빈 Role ROLE_INFRASTRUCTURE: 스프링이 내부에서 사용하는 빈

//toString()

System.out.println("beansOfType = " + beansOfType)

![image](https://user-images.githubusercontent.com/108928206/181250323-f091b297-0131-4080-b4d0-1124746fc159.png)

toString이 정의 되어 있어서 다 출력 된다. 아마 Map이다 보니 그럴 듯

//assertThows

:예외처리를 해준다.

![image](https://user-images.githubusercontent.com/108928206/181250176-c3d465f4-fab6-4045-8e29-99a6b2ae0e61.png)

//static class

![image](https://user-images.githubusercontent.com/108928206/181250378-bf24be68-2e28-4e35-9536-85506506bdf0.png)
