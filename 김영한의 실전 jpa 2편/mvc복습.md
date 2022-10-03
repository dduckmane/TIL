JSON: 형식일뿐이다. 문자이다.

![image](https://user-images.githubusercontent.com/108928206/193562679-c66ad7a0-5566-45b5-87cf-de1fa1d15ca2.png)

[요청 파라미터 - 쿼리 파라미터, HTML Form]

- get: url로 요청파라미터가 온다.
- post: body로 요청파라미터가 온다.

-받는 방법: @RequestParam, @ModelAttribute

[HTTP 요청 메시지]

: body로는 모든것이다.

- body로 와도 요청파라미터가 아니라면  @RequestParam, @ModelAttribute을 사용하지 못한다.
- POST, PUT, PATCH를 사용

- 종류: 단순텍스트, 데이터형식

-받는 방법: 

[HttpEntity, RequestEntity, ResponseEntity]

:헤더와 바디를 받는다.

[@RequestBody]

: 바디를 받는다. 

(변환): objectMapper를 이용

HttpEntity , @RequestBody 를 사용하면 HTTP 메시지 컨버터가 HTTP 메시지 바디의 내용을 우리가 원하는 문자나 객체 등으로 변환해준다.

--> 객체를 json으로 json을 객체로 변환이 가능

@RequestBody: 객체를 json으로

@RequestBody: json을 객체로

![image](https://user-images.githubusercontent.com/108928206/193564501-8d37fb96-1ef5-4d4c-b818-6a8ad9e1be31.png)


