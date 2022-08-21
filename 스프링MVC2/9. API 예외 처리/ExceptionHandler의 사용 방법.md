1. @ExceptionHandler(IllegalArgumentException.class)를 적용한다.
2. @ResponseStatus(HttpStatus.BAD_REQUEST)--> 상태코드를 지정한다.
3. @RestController를 이용하여 서블릿에서 해결한다.

![image](https://user-images.githubusercontent.com/108928206/185789717-2da9603a-4111-4ec1-adc4-7a4152e046db.png)

responseEntity를 써도 가능하다.
