//13주차 문자열 압축 C++
#include <string>
#include <vector>
using namespace std;

int solution(string s);
int main(void) {
    string str = "abcabcdede";
	printf("%d", solution(str));
}

int solution(string s) {
    int answer = s.length();
    for(int i=1; i<=s.length()/2; i++) {
        int len = s.length();
        for(int j=0; j<s.length(); j++) {
            for(int cnt=0, z=i; j+z<s.length(); z+=i) {
                if(s.substr(j, i) == s.substr(j+z, i)) cnt++;
                else {
                    len -= i*cnt;
                    if(cnt) len += to_string(cnt+1).length();
                    j += z-1;
                    break;
                }
                if(j+z+i >= s.length()) {
                    len -= i*cnt;
                    len += to_string(cnt+1).length();
                    j += z;
                }
            }
        }
        if(len < answer) answer = len;
    }
    return answer;
}