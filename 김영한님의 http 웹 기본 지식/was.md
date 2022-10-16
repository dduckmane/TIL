[정적처리]

정적리소스는 ws가 담당하고 resource에 static파일에 넣는다. was보다 ws가 안죽기때문에 여기에 오류페이지를 넣는 것이다.

[동적 처리-동적html처리=ssr]

- 주문을 하다= 회원과 아이템마다 다르다.= 동적이다.--> was가 작용해야한다.

- 동적 html을 생성 동적html은 templates폴더에 넣는다.

![image](https://user-images.githubusercontent.com/108928206/196014143-5124bf70-587a-4ccd-a6d2-23bb240c97e6.png)

![image](https://user-images.githubusercontent.com/108928206/196014183-3697c8a8-2da4-4f59-a9e6-f4b06ba4382a.png)

이렇게 동적으로 html을 처리한다.<-- 이걸 사용하기 위해서 뷰템플릿을 사용하는 것이다.

[동적처리- api처리=csr]

- 웹브라우저에서만 사용할 거면 ssr이지만 이제는 웹서버를 모바일에서도 tv에서도 사용하기 때문에 그대로 html로 내려주는 것이 아니다.
- was가 웹브라우저에게 html을 주면 알지만 이제는 브라우저를 다양한 곳에서도 할 수 있다.
- 그래서 rest api를 사용해서 데이터를 전달
