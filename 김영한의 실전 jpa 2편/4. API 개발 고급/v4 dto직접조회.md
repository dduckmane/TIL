문제점: jpql로 dto로 바로 변환할때 컬렉션은 안됨--> 한마디로 Batchsize가 효과가 없다.-->로직을 만들어줘야함

![image](https://user-images.githubusercontent.com/108928206/194054986-f22cf572-7127-4374-8d0e-cf7d311f79b3.png)

아무리 지연로딩과 batchsize로 가져와도 바로 집어넣을 수가 없음--> 우리가 만들어주어야함

1. id에 맞는 orderItems을 가져오기

![image](https://user-images.githubusercontent.com/108928206/194055257-785791d6-4d79-433a-899f-fe4637fe7a6a.png)

2. 그 다음 foreach로 값을 대입

![image](https://user-images.githubusercontent.com/108928206/194055499-ab4171e2-c912-4886-8f0f-2be2166f094a.png)
