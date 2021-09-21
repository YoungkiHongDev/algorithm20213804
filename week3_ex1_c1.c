// 3주차 문제 1이 될 때까지 C언어 유형1
#include <stdio.h>

int n, k;
int result;

int main(void) {
    scanf("%d %d", &n, &k );

    while (1) {
        // N이 K로 나누어 떨어지는 수가 될 때까지 빼기
        int target = (n / k) * k;
        result += (n - target);
        n = target;

        // N이 K보다 작을 때 (더 이상 나눌 수 없을 때) 반복문 탈출
        if (n < k) break;

        // K로 나누기
        result++;
        n /= k;
    }
    // 마지막으로 남은 수에 대하여 1씩 빼기
    result += (n - 1);
    printf("%d", result);
    return 0;
}