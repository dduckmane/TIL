![image](https://user-images.githubusercontent.com/108928206/185789508-4573cd8c-1c42-46d2-9cd2-965d6db9d549.png)

-서블릿에서 해결이 된다.

-스프링 부트는 기본으로 ExceptionResolver가 등록이 되고

1. ExceptionHandlerExceptionResolver
2. ResponseStatusExceptionResolver: 상태코드를 지정
3. DefaultHandlerExceptionResolver : 알아서 typeMismatch를 잡아서 오류를 400으로 준다.

이렇게 3가지가 등록이 된다.

![image](https://user-images.githubusercontent.com/108928206/185789635-db977ee4-be0c-42ff-a2f0-7755dcccecca.png)
