BFS
-----------------
정의: 모든 정점을 한번씩 방문=모든 경우의 수를 다 해봄


기능: 최단 거리를 구하는 알고리즘

최단거리 알고리즘인 이유:

![image](https://user-images.githubusercontent.com/108928206/178435303-0b0f6330-9ed1-4ff1-bc95-a72a1add7c54.png)



예를 들어 n.m으로 가고 싶다면 다른 곳을 통해서도 n,m으로 올수 있지만 


가장먼저 도착한 것이 check되면서 다른 방향으로는 오지 못함


[알고리즘 구현]
1.큐를 구현하고 처음 경우를 집어넣는다

![image](https://user-images.githubusercontent.com/108928206/178435452-11b42317-6ced-42b3-9184-d844436176ec.png)

2.범위를 지정한다.


![image](https://user-images.githubusercontent.com/108928206/178435662-6272aedb-e065-48ce-8ee6-04bac51e5b8e.png)


3. 갈 수 있다면 집어넣고 거리를 센다


![image](https://user-images.githubusercontent.com/108928206/178435761-84b39c8f-6ee3-447b-b665-ff70ca282150.png)
