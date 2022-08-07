서블릿으로 동적으로 html를 만들 수 있지만 자바코드로 html를 구현하기가 어렵다.

그래서 템플릿 엔진을 사용한다.

템플릿 엔진중 하나가 jsp이다.

jsp은 템플릿 엔진으로 html문서안에 자바코드를 손쉽게 넣을 수 있다.

jsp특징

1. main/webapp/jsp/members/save.jsp라고 만들면 /jsp/members/save.jsp의 서블릿으로 작동한다.
2. 그래서 request와 response객체를 사용이 가능하다.
3. <%를 이용하여 자바코드를 넣을 수 있다.

[한계]

하지만 로직과 뷰가 같이 있어서 불편하다.
