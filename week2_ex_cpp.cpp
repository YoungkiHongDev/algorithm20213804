// 2주차 거스름 돈 문제 C++
#include <bits/stdc++.h>

using namespace std;

int n = 1260;
int cnt;

int coinTypes[4] = {500, 100, 50, 10};

int main(void) {
    for (int 1=0; i<4; i++) {
        cnt += n/coinTypes[i];
        n %= coinTypes[i];
    }

    cout << cnt << '\n';
}