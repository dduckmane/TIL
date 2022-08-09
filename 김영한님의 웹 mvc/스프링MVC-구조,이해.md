[구조]

![image](https://user-images.githubusercontent.com/108928206/183548608-c3253511-c558-4eac-aa6a-e46a65481842.png)

1. http 요청
2. 헨들러 조회: HandlerMapping실행
3. 핸들러 어뎁터 조회: HandlerAdapter의 supports()실행
4. 헨들러 어뎁터 실행: ex) 에노테이션 기반이라면 RequestMappingHandlerAdapter가 실행
5. 헨들러(컨트롤러)가 실행이 되면서 ModelAndView가 반환
6. view리졸버실행: 뷰를 반환
7. 뷰가 모델을 이용해서 렌더링(=http응답)

[상세]

1. http요청

2. 헨들러 조회

hadlerMapping이 실행이 되면서

![image](https://user-images.githubusercontent.com/108928206/183549308-efe3139a-9e3f-44cc-bbdb-a84f9d1dd2b1.png)

에노테이션 기반 컨트롤러인지 빈 기반인지에 따라 다른 헨들러메핑이 실행이 된다.

3. 헨들러 어뎁터 조회

HandlerAdapter 의 supports() 를 순서대로 호출한다

![image](https://user-images.githubusercontent.com/108928206/183549434-ae65dc88-293b-47da-9c3f-ed4a5d738d2b.png)

위의 종류에서 어떤 기반인지에 따라 다른 어뎁터가 조회가 된다.

4. 헨들러 어뎁터가 실행

: 로직에 맞게 어뎁팅이 되고 모델엔뷰를 반환한다.

5. viewResolver가 논리주소를 이용해서 view를 반환한다.

6. view가 모델에 있는 정보를 바탕으로 렌더링을 한다.
