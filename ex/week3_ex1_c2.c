// 3주차 문제 1이 될 때까지 C언어 유형2
#include <stdio.h>

int n, k;
int result; //수행 횟수

int main(void) {
    scanf("%d %d", &n, &k );

    while (1) {
        // N이 K로 나누어 떨어지는 수가 될 때까지 빼기
        if ((n % k) == 0 ) {
            n /= k; // 2번 작업 K로 나누기
        } else {
            n = n -1; // 1번 작업 1 빼기
        }
        result++;
        if (n < k) break;
    }
    // 마지막으로 남은 수에 대하여 1씩 빼기
    result += (n - 1);
    printf("%d", result);
    return 0;
}