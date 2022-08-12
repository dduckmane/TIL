-post로 받으면 prg를 생각하자

[이유]

-post로 받는다=form으로 받는다.

-post로 받으면 정보가 주로 저장이 되거나 수정이 된다.

-그 상태에서 새로고침하면 똑같은 http메서드가 가기 때문에 중복이 일어난다.

[사용법]

1. return시에 "redirect"를 추가하자
2. RedirectAttributes를 사용하자

[RedirectAttributes]

-리다이렉트시 정보를 담을 수가 있다.

-redirectAttributes.addAttribute("itemId", savedItem.getId());담으면 itemId라는 이름을 키로 사용이 가능하다.

-그걸 리다이렉티스에 적용이 가능하다.

-"redirect:/basic/items/{itemId}"

-리다이렉트 경로변수로 적용되지 않는 것은 쿼리 파라미터 형식으로 간다.

ex)

![image](https://user-images.githubusercontent.com/108928206/184279759-2ec4912e-ba76-4a89-b053-3fa6e8dcce71.png)

![image](https://user-images.githubusercontent.com/108928206/184279772-3648c394-5bb3-401b-af20-78f510f84ece.png)

