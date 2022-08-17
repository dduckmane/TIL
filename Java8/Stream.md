[흐름]

1. 종료 메서드와 중개 메서드가 있다.
2. 중개메서드는 종료메서드가 없으면 실행을 안한다.
3. 중개 메서드는 stream을 리턴한다.
4. 종료메서드는 받아서 특정값을 리턴한다.

[중개 메서드]

1. Filter: 매개변수가 Predicate함수형 인터페이스이다. 

![image](https://user-images.githubusercontent.com/108928206/185147820-39a4ad5e-1d04-4a91-811b-f773351c0c37.png)

매개변수-> boolean리턴 함수형식이다.

Predicate형을 매개변수로 받아서 true인 애들만 Stream으로 반환한다.

2. Map: 매개변수가 Function함수형 인터페이스이다.

![image](https://user-images.githubusercontent.com/108928206/185148333-52921751-0381-472d-a7af-63e47c2d359b.png)

그래서 주로 형변환에 사용이 된다.

매개변수--> 다른것을 리턴하는 함수


Function으로 형변환이 일어난 애들을 Stream으로 return한다.

3. FlatMap

![image](https://user-images.githubusercontent.com/108928206/185148984-14092e11-9d06-43df-8040-4f5f25247e1c.png)

이렇게 컬랙션을 다 벗겨주는 역할을 한다.

4. 제한하기

limit(long) 또는 skip(long)

예) 최대 5개의 요소가 담긴 스트림을 리턴한다.

예) 앞에서 3개를 뺀 나머지 스트림을 리턴한다.

[종료 메서드]

1. anyMatch(), allMatch(), nonMatch()

매개변수가 predicate형이다.

그래서

매개변수-->boolean리턴 함수

스트림의 매개변수들을 받아 true가 반환된 애들만 모아 boolean으로 반환한다.

2. collect

![image](https://user-images.githubusercontent.com/108928206/185149907-5dd90b76-7aa7-4ace-bc7c-4160f518f727.png)

스트림으로 온 애들을 컬렉션으로 만든다.
