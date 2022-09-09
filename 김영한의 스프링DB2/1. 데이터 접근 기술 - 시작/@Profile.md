1. /src/main/resources 하위의 application.properties에 

      
        -spring.profiles.active=local를 적어준다.
        
          --> 그러면 main에서는 local이라는 이름을 가지게 된다.
          
2. 빈을 등록시에 profile이라는 에노테이션을 붙여주면 local이 시작될 때만 메서드가 실행이 된다.--> 예를 들어 test profile인 경우에는 실행이 안됨
  
  ![image](https://user-images.githubusercontent.com/108928206/189323710-fca52417-3901-4f87-a09f-351d1a717848.png)


  
