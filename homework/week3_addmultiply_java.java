// 3주차 과제 문제2) 곱하기 혹은 더하기 Java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //입력받을 스캐너
        String str = sc.next(); //문자열로 된 숫자 입력받기
        
        //숫자 0~9는 유니코드로 48~57이므로 빼기 48
        int num1 = str.charAt(0)-48; //첫글자 숫자로 변경해서 저장

        //남은 숫자 개수만큼 for문 돌리기
        for(int i=1; i<str.length(); i++) {
            int num2 = str.charAt(i)-48; //뒷글자 숫자로 변경해서 저장

            //앞뒤 숫자가 0~1이면 더하기, 아니면 곱하기
            if(num1 <= 1 || num2 <= 2) {
                num1 += num2; //더하기 수행
            } else {
                num1 *= num2; //곱하기 수행
            }
        }
        System.out.println(num1); //결과 출력
    }
}