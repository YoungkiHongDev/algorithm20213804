// 5주차 과제4 문자열 재정립 (C)
#include <stdio.h>
#include <ctype.h>

int main() {
    char word[100];
    char reword[100];
    scanf("%s", word);
    
    int cnt = 0;
    int value = 0;
    char temp;
    
    for(int i=0; i<sizeof(word); i++) {
        if(word[i] == '\0') {
            break;
        } else if(isalpha(word[i])) {
            reword[cnt] = word[i];
            cnt++;
        } else {
            value += word[i] - '0';
        }
    }
    
    for(int i=0; i<cnt; i++) {
        for(int j=0; j<cnt-1; j++) {
            if(reword[j] > reword[j+1]) {
                temp = reword[j];
                reword[j] = reword[j+1];
                reword[j+1] = temp;
            }
        }
    }
    
    for(int i=0; i<cnt; i++) {
        printf("%c", reword[i]);
    }
    printf("%d\n", value);
    return 0;
}