// 5주차 과제2 시각 (C)
#include <stdio.h>

int main() {
    int hour = 0;
    int cnt = 0;
    scanf("%d", &hour);
	
	for(int i=0; i<hour+1; i++) {
	    for(int j=0; j<60; j++) {
	        for(int k=0; k<60; k++) {
	            if(i%10==3 || j/10==3 || j%10==3 || k/10==3 || k%10==3) cnt++;
	        }
	    }
	}
	//결과 출력
	printf("%d\n", cnt);
	return 0;
}