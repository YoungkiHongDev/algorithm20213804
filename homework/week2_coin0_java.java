// 백준 11047번 문제 - 동전0
import java.io.*;
import java.lang.String;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in); //입력받을 스캐너 선언

        String nk = sc.nextLine(); //동전의 종류와 총합 입력받기 ex) 10 4200
        String[] temp = nk.split(" "); //공백을 기준으로 잘라서 배열에 저장
        
        int n = Integer.parseInt(temp[0]); //동전의 종류 저장
        int k = Integer.parseInt(temp[1]); //동전의 총합 저장

        int cnt=0; //동전의 개수를 저장할 변수
        int[] coin = new int[n]; //동전의 단위를 저장할 배열

        //동전의 종류 n값 만큼 for문 돌리기
        for(int i=0; i<n; i++) {
            coin[i] = sc.nextInt(); //동전의 단위를 입력받아 배열에 저장
        }

        //동전의 단위 배열을 역순으로 조회하는 for문 돌리기
        for(int i=n-1; i>=0; i--) {
            cnt += k/coin[i]; //동전의 개수 저장
            k %= coin[i]; //나머지 저장
        }

        System.out.println(cnt); //동전의 총 개수 출력
    }
}