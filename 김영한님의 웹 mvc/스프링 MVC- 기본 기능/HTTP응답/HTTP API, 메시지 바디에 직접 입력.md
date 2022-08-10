[text형식]
1. response객체를 이용
2. ResponseEntity를 이용--> HttpEntity는 바디와 헤더 둘다 된다.
3. @ResponseBody를 이용

[json형식]-객체를 주는 형식
1. ResponseEntity를 이용
2. @ResponseBody를 이용\


-@ResponseBody 를 사용하면 view를 사용하지 않고, HTTP 메시지 컨버터를 통해서 HTTP 메시지를 직접 입력할 수 있다. ResponseEntity 도 동일한 방식으로 동작한다.

-@ResponseBody를 이용하면 상태코드가 정적으로 되서 동적이게 사용할려면 responseEntity를 이용하면 된다.

[@RestController]

-responsebody에노테이션을 클래스 레벨에두면 전체 메서드에 적용
-그러면 

@Controller

@ResponseBody

이렇게 되니까 아예--> 합쳐진 @RestController를 사용한다.

[결론]

-데어터가 직접가야하므로 뷰리졸버가 실행이 되면 안됨

-그래서 메시지 컨버터가 실행이 되어야함

-메시지 컨버터가 실행이 될려면 --> httpentity를 이용하던가 responsebody에노테이션을 이용해야한다.

-차이점은 에노테이션은 상태코드가 정적이다.
