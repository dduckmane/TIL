Bean validator와 수동 validator를 같이 사용한다.

![image](https://user-images.githubusercontent.com/108928206/189530006-214b7076-a036-4ebb-bde0-814d5a955279.png)

![image](https://user-images.githubusercontent.com/108928206/189530015-d656ec45-353c-473a-b2e5-43fd9a494f4c.png)

[validator 분리 사용]

-@Valid가 잇으면 무조건 validator가 작용하기 때문에 if문으로 나눠줘야 한다.

![image](https://user-images.githubusercontent.com/108928206/189622750-5f16c784-ac80-47f4-9ca8-dd5df26e8077.png)

