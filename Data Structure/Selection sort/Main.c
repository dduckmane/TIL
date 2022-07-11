#include <stdio.h>
#define swap(type,x,y) do{type t=x;x=y;y=t;} while(0)
choice(int a[], int n) {
    int i, j;
    int idx;
    for (i = 0; i < n; i++) {
         int min = 100;//위에 가면 안됨. 위에가면 min이 고정이 됨
        for (j = i; j < n && a[j] < min; j++) {//for 조건식에서 a[j]<min이 하나라도 안되면 증감이 안됨
               min = a[j];
            idx = j;
        }
        swap(int, a[i], a[idx]);
    }
}

int main() {
    int nx;
    int* x;
    printf("num");
    scanf("%d", &nx);
    for (int i = 0; i < nx; i++) {
        printf("scan"); scanf("%d", &x[i]);
    }
    choice(x, nx);
    for (int i = 0; i < nx; i++) 
        printf("%d", x[i]);
    
        return 0;
}
