폼테크에 enctype=multipart/form-data라고 적어주면 문자열과 파일이 서버로 전발이 된다.

하지만 저렇게 선언을 하면 일반적으로 전송하는 방식과 달라져서 modelattribute로 주입이 안된다.

그래서 해결방법은

![image](https://user-images.githubusercontent.com/108928206/189774154-793cf5ca-3077-4525-952d-a00ad85328bf.png)

![image](https://user-images.githubusercontent.com/108928206/189774616-de5fbe7b-5007-4549-9346-5eebedff8b73.png)

[매개변수]

-파일데이터를 저장해놓는 임시파일의 경로--> null을 하면 아파치톰켓에서 정한 폴더로 된다.

-업로드 파일의 최대용량: 바이트단위로 넣어야한다.

-파일뿐만 아니라 클라이언트가 입력한 데이터를 포함한 전체 용량

-임계값: 0으로 하면 알아서 저장이 된다.

[multipartFile]

클라이언트가 파일을 보내면 멀티파트파일이라는 객체로 만들어서 주입할려고 한다.

그래서 MultipartFile로 받아야 한다.

![image](https://user-images.githubusercontent.com/108928206/189774809-e9d56feb-ab8d-4fa4-b2a2-82ffcffaa7c3.png)

[주의사항]

-멀티파트객체는 파일의 첨부와 상관없이 생성이 되어 주입은 된다.

-하지만 사이즈가 0이냐 아니냐로 진짜 파일이 업로드가 되었는 지 확인할 수 잇다.

