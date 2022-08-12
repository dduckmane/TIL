api형식이 아닌 html형식이기 때문에 리소스와 행위를 구분하는데 한계가 있다.

[url설계]

공통: /basic/items

1. 상품 목록: /basic/items
2. 상품 등록: /basic/items/add -->html form이 존재--> get post로 나눈다.
3. 상품 상세: /basic/items/{itemId}
4. 상품 수정: /basic/items/{itemId}/edit -->html form이 존재--> get post로 나눈다.

-상세나 수정은 특정 자원에 해당하는 것이므로 경로변수를 지정한다.

-post사용시에는 prg를 사용한다.

-요청정보를 받을 때는 form으로 받으면 model로 받으면 되지만 

-form이 아니면 정보를 주기 힘듦으로 경로변수를 사용해야한다.

-그래서 상세에서 수정으로 갈시에 상세에는 form이 없으므로 경로변수로 줘야한다.
