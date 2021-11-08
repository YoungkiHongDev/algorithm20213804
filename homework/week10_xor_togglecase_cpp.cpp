#include <iostream>
using namespace std;

char *toggleCase(char *a) {
    for (int i=0; a[i]!='\0'; i++) {
        a[i]^=32;
    }
    return a;
}

int main() {
    char str[] = "HongYoungKi";
	cout<<"Toggle Case: "<<toggleCase(str)<<'\n';
	cout<<"Original Case: "<<toggleCase(str)<<'\n';
	return 0;
}