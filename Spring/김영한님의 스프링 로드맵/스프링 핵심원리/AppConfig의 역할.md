![image](https://user-images.githubusercontent.com/108928206/181244801-169a55e7-605f-4b36-829c-bb76f968084a.png)

1. dip를 위반한다.
2. ocp를 위반한다.

[AppConfig]

![image](https://user-images.githubusercontent.com/108928206/181245492-a8a074b3-d425-46e8-8d2c-15be24442109.png)

로 설정한 뒤에

![image](https://user-images.githubusercontent.com/108928206/181245425-0b4644f3-5895-4e33-a043-2409f3cef3ae.png)

AppConfig를 이용하여 생성자 주입을 해준다.

[역할]
1. 클라이언트 코드에서는 오로직 역할을 의존한다.
2. 구성영역과 사용영역을 분리한다.

![image](https://user-images.githubusercontent.com/108928206/181245848-22f1cc34-3b60-4c98-8a25-c525181edc46.png)

3. 이렇게 하면 ocp와 dip가 지켜진다.

[결론]

=AppConfig는 Ioc와 Di이다. 이 역할은 

사용영역과 구성영역으로 나누워 주어 SOLID를 지켜준다.

[추가설명]

![image](https://user-images.githubusercontent.com/108928206/181246306-3c473302-c70d-40d2-8ddf-a647a52dc0c8.png)
![image](https://user-images.githubusercontent.com/108928206/181246330-d4addc13-3e81-4a93-8cae-fd197e0e134c.png)
![image](https://user-images.githubusercontent.com/108928206/181246361-8ba633c6-81b2-484b-a899-0bbbd5df5b75.png)
![image](https://user-images.githubusercontent.com/108928206/181246392-cf4853f0-81e7-429d-9dac-e4eee112c785.png)

