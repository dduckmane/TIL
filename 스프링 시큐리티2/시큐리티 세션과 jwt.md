## [세션 stateless]

![image](https://user-images.githubusercontent.com/108928206/201461419-61204c24-09ec-4267-a422-418a3a2f4ded.png)

- 세션이 없다는 의미가 아니라 세션을 무상태성으로 만들겠다.
- 시큐리티 세션을 사용하긴 하지만 무상태성으로 한번의 요청에서만 세션이 살아있다.

## [권한처리전에 authenticate에 principalDetails넣어두기]

- 권한처리 부분

![image](https://user-images.githubusercontent.com/108928206/201461500-8923ee10-d770-4fae-abb6-d1063a6acc7b.png)

이 부분은 authentication영역안에 

![image](https://user-images.githubusercontent.com/108928206/201461530-6990bd4a-8c21-4ae7-a08c-b936a41a9dd6.png)

이 부분을 바탕으로 하는데 그래서 이전에 authentication영역안에 userDetails가 존재를 해야한다.

- 권한처리시에 BasicAuthenticationFilter가 실행

  --> 여기서 authentication영역에 담아둠
  
  ![image](https://user-images.githubusercontent.com/108928206/201461608-768fb595-8dfa-4fc9-8276-e40a4e8cc13d.png)
