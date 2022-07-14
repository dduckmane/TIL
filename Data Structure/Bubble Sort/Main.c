#include <stdio.h>
#include <stdlib.h>
#define swap(type, x, y) do { type t = x; x = y; y = t; } while (0)//do가 사라지기 때문에 변수선언을 여러번 할 수 있다. define으로 정의를 했기 때문에 자료형을 바꿀 수 있다.
void bubble(int a[], int n) { /* 버블 정렬 */
	int i, j;
	for (i = 0; i < n - 1; i++) { //밑에 for에 범위를 설정해주는 일
		for (j = n - 1; j > i; j--) /* 끝자리는 안 바뀌므로 j-1부터 시작 */
			if (a[j - 1] > a[j])swap(int, a[j - 1], a[j]);
	}
}
int main(void) {
	int i, nx; int* x; /* 배열의 첫 번째 요소에 대한 포인터 */
	puts("버블 정렬");
	printf("요소개수 : ");
	scanf("%d", &nx);
	x = calloc(nx, sizeof(int)); /* 요소의 개수가 nx인 int형 배열을 생성 */
	for (i = 0; i < nx; i++) {
		printf("x[%d] : ", i); scanf("%d", &x[i]);
	}
	bubble(x, nx); /* 배열 x를 버블 정렬 */
	puts("오름차순으로 정렬했습니다.");
	for (i = 0; i < nx; i++)
		printf("x[%d] = %d\n", i, x[i]);
	free(x); /* 배열 해제 */
	return 0;
}
