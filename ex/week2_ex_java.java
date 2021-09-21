//2주차 거스름 돈 문제 Java

import java.io.*;

public class Main {
    public static void main(String[] args) {
        int n = 1260;
        int cnt = 0;
        int[] coinTypes = {500, 100, 50, 10};

        for (int i=0; i<4; i++) {
            cnt += n/coinTypes[i]; //거슬러준 돈
            n %= coinTypes[i]; //나머지 거스름 돈
        }
        
        System.out.println(cnt);
    }
}