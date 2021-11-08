#include <iostream>
#include <cmath>
using namespace std;

int getRightBit(int n) {
    return log2(~n&(n+1)) + 1;
}

int setRightBit(int n) {
    if (n == 0) return 1;
    if ((n & (n + 1)) == 0) return n;
    int pos = getRightBit(n);
    return ((1 << (pos - 1)) | n);
}

int main() {
    int n = 21;
    std::cout << setRightBit(n) << std::endl;
    return 0;
}