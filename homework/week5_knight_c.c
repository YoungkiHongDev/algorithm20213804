// 5주차 과제3 왕실의 나이트 (C)
#include <stdio.h>

int main() {
    char col;
    int row;
    int column;
    
    scanf("%c%d", &col, &row);
    column = col-96;
    
    int dx[8] = {-2, -1, 1, 2, 2, 1, -1, -2};
    int dy[8] = {-1, -2, -2, -1, 1, 2, 2, 1};
    int result = 0;
    
    for(int i=0; i<8; i++) {
        int nextRow = row + dx[i];
        int nextCol = column + dy[i];
        
        if(nextRow >= 1 && nextRow <= 8 && nextCol >= 1 && nextCol <= 8) {
            result++;
        }
    }
    //결과 출력
    printf("%d", result);
	return 0;
}