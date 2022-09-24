[부모box가 사이즈가 지정시에]

box모델안에 content안에 content가 들어가는 것이 아니라

box모델안에 content top-0 left-0에 자식 content가 시작한다.라는 의미이다.

그래서 자식 박스에 마진을 주면 마진이 부모박스에서 삐져나가게 된다.

![image](https://user-images.githubusercontent.com/108928206/192081102-0fe50b45-db2a-4bd1-a282-05b5457a3468.png)

이렇게 삐져나간다.

content안에서 margin padding이 다 들어가는 것이 아니라 부모 content안에 자식 content가 시작이 된다.

![image](https://user-images.githubusercontent.com/108928206/192081140-630b9488-b29c-47c1-8393-0e74a4750156.png)
