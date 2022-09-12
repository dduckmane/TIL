상단 메뉴처럼 모든 곳에서 요청할 시에도 intercepter를 만든다.

1. 인터셉터는 주입이 안된다.
2. 그래서 webconfig에서 bean을 주입해주어야한다.

![image](https://user-images.githubusercontent.com/108928206/189654605-0d0d6ece-a666-44d1-93cd-b133967c0591.png)

![image](https://user-images.githubusercontent.com/108928206/189654658-479e5ca2-e621-4154-82b8-3da15b75f560.png)

이렇게 config에서 주입받아서

![image](https://user-images.githubusercontent.com/108928206/189654865-3eeef58e-2058-4a94-a415-b5b88a3fb52b.png)

addInterceptor에서 넣는다.
