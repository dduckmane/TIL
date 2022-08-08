[구조]

![image](https://user-images.githubusercontent.com/108928206/183412910-4e2d61b2-6e59-4859-9e4c-566acd619f13.png)

1. modelview를 만든다.

![image](https://user-images.githubusercontent.com/108928206/183413027-135e480f-1e67-43b7-a954-6ec7b0932c81.png)

1) 넘겨줄 view의 이름
2) view의 넘겨줄 데이터가 model에 있다.

3. Controller는 매개변수로 파라미터만 받는다.

  Map<String, String> paramMap여기에 파라미터, 값이 들어있다.
  
4. Controller는 파라미터map으로 로직을 실행하고ModelView를 반환한다.

![image](https://user-images.githubusercontent.com/108928206/183413183-b4bf1c8f-410b-4be5-afca-fa613498ab39.png)

5. 논리주소로 준다.

![image](https://user-images.githubusercontent.com/108928206/183413443-19c8300c-5a70-43ff-ab83-2784090da491.png)

6. frontcontroller에서 해결한다.

1) controller는 파라미터쌍이 필요하기 때문에 createmap이 필요하다.

![image](https://user-images.githubusercontent.com/108928206/183413980-82d38b13-45de-4c09-9856-3e6945d5660c.png)

2) 논리주소로 주었기 때문에 물리적 주소로 변환을 해줄 viewResolver가 필요하다.

![image](https://user-images.githubusercontent.com/108928206/183414070-7ccdcc58-62c4-499d-a3a9-deeec7bc3f48.png)

3) view가 model의 값을 이용해서 request에 담아주어야한다.

![image](https://user-images.githubusercontent.com/108928206/183414830-d94bcd44-dddc-46a6-b59e-3d58f9cb472a.png)


![image](https://user-images.githubusercontent.com/108928206/183414946-e30a9848-41fc-4f7a-ab90-fa3131600a3b.png)

