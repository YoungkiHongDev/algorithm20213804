// 4주차 문제 배열 값 중 0값을 찾아 배열 뒤로 배치시키기 C
// 추가 공간을 사용하여 시간 복잡도 O(n)을 만족하지만
// 공간 복잡도 O(1)을 만족하지 못하여 O(n)이 된 예제
#include <stdio.h>

int main(void)
{
    int arr1[] = { 2, 3, 0, 0, 4, 0, 6 };
    int n = sizeof(arr1) / sizeof(arr1[0]);
    int arr2[n];
    int j = 0;

    for (int i = 0; i < n; i++)
    {
        if (arr1[i] != 0) {
            arr2[j] = arr1[i];
            j = j + 1;
        }
    }

    for (int i = j; i < n; i++)
        arr2[i] = 0;

    for (int i = 0; i < n; i++)
        printf("%d ", arr2[i]);

    return 0;
}