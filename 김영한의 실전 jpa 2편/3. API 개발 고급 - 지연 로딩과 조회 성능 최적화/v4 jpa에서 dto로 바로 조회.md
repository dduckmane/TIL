![image](https://user-images.githubusercontent.com/108928206/193970287-702091b5-4a7d-4a0f-abac-e18eb4acf29f.png)

이런식으로 하면 바로 할 수 있다.

![image](https://user-images.githubusercontent.com/108928206/193970679-178a67a8-08a8-4eb5-82b9-cdeedd4051de.png)

이렇게 하면 원하는 것만 가져올 수가 잇다.

재사용성이 떨어진다. 성능이 좀 더 좋지만 그렇게 차이가 나지는 않는다.

v4는 orderRepository에 잇는 것을 볼 수가 있는데 이건 리포지토리가 화면에 의존한 것이다.

결론: 

1. 조회데이터가 많이 차이나면 v4를 사용하고 적게 차이나면 v3를 사용하자

![image](https://user-images.githubusercontent.com/108928206/193972264-a0e8d15f-f6c9-4942-894c-3b0be2d58f5f.png)

2. 따로 페키지를 만들자--> OrderRepository와 별개를 하자

![image](https://user-images.githubusercontent.com/108928206/193972672-c371b34f-b607-4379-b714-8e51359da215.png)


