기존의 문제점:

뷰로 이동하는 부분의 반복

[해결]

1. 뷰를 분리한다.
2. controller가 실행이 되고 view를 반환하게끔 한다.

[구조]

![image](https://user-images.githubusercontent.com/108928206/183411861-b95966d9-a53d-467f-93ff-6e3bf1fee7f9.png)

1. 뷰를 분리해서 이동하는 부분을 묶어준다.

![image](https://user-images.githubusercontent.com/108928206/183412013-288e764d-3cb6-4f40-b35f-2d3322f92696.png)

2. 컨트롤러에서 로직과 뷰를 같이 실행하는 것이 아니라 로직을 실행하고 뷰를 반환한다.

![image](https://user-images.githubusercontent.com/108928206/183412133-bf966229-9265-489d-a17c-a7e64e3568d8.png)

[문제점]

1. 컨트롤러가 서블릿에 종속적이다.

![image](https://user-images.githubusercontent.com/108928206/183412133-bf966229-9265-489d-a17c-a7e64e3568d8.png)

보면 궅이 종속적일 필요가 없고 로직에 필요한 파라미터가 필요한것이지 request객체나 reponse객체가 필요가 없다.

2. 그래서 모델부분도 request가 하고 있다.

  ![image](https://user-images.githubusercontent.com/108928206/183412674-afbba2b4-e686-4bc4-ad0f-537859f1a7c6.png)

  
3. 물리적 주소에 반복이 있다.

  ![image](https://user-images.githubusercontent.com/108928206/183412731-26ddc11f-6a5b-487f-a480-9981c883a5cd.png)

