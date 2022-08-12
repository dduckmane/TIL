api형식이 아닌 html형식이기 때문에 리소스와 행위를 구분하는데 한계가 있다.

[url설계]

공통: /basic/items

1. 상품 목록: /basic/items
2. 상품 등록: /basic/items/add -->html form이 존재--> get post로 나눈다.
3. 상품 상세: /basic/items/{itemId}
4. 상품 수정: /basic/items/{itemId}/edit -->html form이 존재--> get post로 나눈다.

-html에서의 요청은 form방식과 url방식밖에 없다.

-그래서 form으로 오면 경로를 뭐로 해도 상관이 없지만 form이 없으면 url를 이용해서 요청할수 밖에 없다.

-따라서 상세나 수정은 form으로 오는 것이 아니므로 경로 변수를 이용해야한다.

-post사용시에는 prg를 사용한다.

