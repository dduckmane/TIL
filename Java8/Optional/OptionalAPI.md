1. findFirst: optional을 반환한다.

![image](https://user-images.githubusercontent.com/108928206/185416625-b22434c0-cff2-48a6-846b-fd066c25a504.png)

2. ispresent: optional에 null이 없고 객체가 있으면 true, null이 있으면 false

![image](https://user-images.githubusercontent.com/108928206/185416751-e25eb7d3-8cb7-4cd5-a3b2-d9a6ba42ac85.png)

3. isEmpty: isPresent와 반대이다.

[값을 가져오기]

1. get: 값이 잇으면 꺼내지만 없으면 에러가 난다.--> 사용안한다.

2. ifPresent: 만약 있으면 이다.

![image](https://user-images.githubusercontent.com/108928206/185420811-be7a337e-19e0-431d-8fa7-588acb6c98da.png)

![image](https://user-images.githubusercontent.com/108928206/185420959-0b3715a4-0485-4bed-b312-5f9aca878689.png)

만약 있으면 무엇을 하겠다.

3. orElse(): 있으면 인스턴스와 값을 가져오고 값이 없으면 인스턴스만 가져온다.

![image](https://user-images.githubusercontent.com/108928206/185421292-65ef09d0-6d2b-45a6-8871-bfdcc7aceaf3.png)

단점은 값이 잇어도 인스턴스를 가져온다.

4. orElseGet: 값이 있으면 가져오고 없으면 인스턴스를 가져와라(orElse보단 이걸 사용)

5. orElseThrow: 값이 있으면 가져오고 없으면 에러를 발생시킨다.

![image](https://user-images.githubusercontent.com/108928206/185422819-8ae747ca-aa7a-47e7-85aa-1c1e3d0f1c7b.png)

6. filter: 값이 잇으면 가져오고 없으면 빈 optional를 준다.

![image](https://user-images.githubusercontent.com/108928206/185424244-5bbeef03-4203-40ea-ae3b-827beb58b1f3.png)

이건 stream의 fiter랑은 또 다르다.

7. map: 꺼낼것인데 형변환을 할때 사용한다. 형이 변환된 optional로 받는다.

단점은 optional을 optional로 꺼낼때 문제가 된다.

![image](https://user-images.githubusercontent.com/108928206/185427349-75d49b5b-2503-4460-9745-50015b5c2b42.png)

8. flatmap: optional에서 제공하는 flatmap은 optional이 들어와서 optional로 올때 optional로 나온다.

![image](https://user-images.githubusercontent.com/108928206/185427728-f066e9c6-d97d-4082-b65c-e467a7d695fd.png)

이 원리랑 비슷하다 없으면 빈 optional로 나온다.





