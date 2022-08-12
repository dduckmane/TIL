![image](https://user-images.githubusercontent.com/108928206/184277763-98a7455e-7cf3-4d0a-a9ec-33a0d28c5b92.png)


![image](https://user-images.githubusercontent.com/108928206/184277753-9c401429-daeb-4c95-9242-0b5924ce7875.png)

![image](https://user-images.githubusercontent.com/108928206/184277781-64a532c0-13fc-47d5-930c-19c2fc21b0c3.png)

![image](https://user-images.githubusercontent.com/108928206/184277789-83fb819a-e26f-443f-bb11-70500b44977d.png)

[기능 2가지]

1) 객체생성: @ModelAttribute는 객체를 생성하고 프로퍼티 접근법으로 입력해준다.
2) Model에 전달: 모델에 지정한 객체를 자동으로 넣어준다.

-주의: 모델에 전달 할때 모델의 이름은 클래스의 첫글자만 소문자로 변경해서 전달한다. 변수이름으로 가는 것이 아니다.

    -@ModelAttribute("item") Item item이런식으로 이름을 지정해주면 그 이름대로 모델에 가지만
    
    -생략시에는 클래스이름에서 첫글자만 소문자로 바뀌어서 들어간다.
    
