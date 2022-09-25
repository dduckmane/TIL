![image](https://user-images.githubusercontent.com/108928206/192129360-c75e19ce-d6a5-42e8-a8cd-1ac527f8dbfc.png)

float: 한글에 어울림과 같다.

[특징]

1. float을 준애만 영향을 받는게 아니다.
2. float양쪽에 float을 영향을 안준애들고 영향을 받는다.
3. float:left는 어울림처리를 왼쪽으로 해라라는 의미이다.

[clearfix]

![image](https://user-images.githubusercontent.com/108928206/192129411-061c99c5-af78-4c20-85f8-bbad99efc000.png)

1. css되어있는 container안에 float(어울림)처리를 해주면 레이아웃이 망가진다.
2. 그러기 위해 어울림을 중단해줘야한다.
3. 그래서 만든것이 clearfix이다.
4. float옆에 일단 두고 그것을 clear로 어울림영향을 끊어준다.
