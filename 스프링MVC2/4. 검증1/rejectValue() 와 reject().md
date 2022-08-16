![image](https://user-images.githubusercontent.com/108928206/184810884-a5c92193-0c44-4810-86d1-ac3a46be0d76.png)

![image](https://user-images.githubusercontent.com/108928206/184810939-c427a811-955b-4a1f-bb19-47d8f6b95e33.png)

을 이용해서 필드오류와 글로벌 오류를 만들어주는 역할을 한다.

이미 타겟을 알고 있기 때문에 가능

![image](https://user-images.githubusercontent.com/108928206/184811055-6eae27f4-ccab-4139-884a-f2dbe812749e.png)

[작용]

1. rejectValue() 호출(바인딩이 되었다는 가정)
2. MessageCodesResolver 를 사용해서 검증 오류 코드로 메시지 코드들을 생성

  총 4가지의 메시지를 생성한다. 
  
  ![image](https://user-images.githubusercontent.com/108928206/184811448-89c2b26b-79c6-4424-883c-962b39540d69.png)

3. 4개의 메시지를 String배열에 넣어서 new FieldError() 를 생성하고 보관한다.

4. th:erros 에서 메시지 코드들로 메시지를 순서대로 메시지에서 찾고 메시지 소스(Message Source)를 실행한다.
5. messages.properties를 뒤져서 가져온다.

