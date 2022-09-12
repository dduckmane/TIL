url로 오는 것은 다 getmapping이 받는다.

getmapping으로 오면

두가지 방식으로 데이터를 받는다.

1. pathvariable: user/1 --> @Pathvarialbe int id
2. requestParam: user/id=1 --> @RequestParam("id")int id
