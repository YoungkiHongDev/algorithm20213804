// 5주차 과제1 상하좌우 (java)
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = 1;
        int y = 1;
        int nx = 0;
        int ny = 0;
        
        //이동 횟수 입력받기
        int n = sc.nextInt();
        
        //nextInt 개행문자 제거
        sc.nextLine();
        
        //이동 계획 입력받기 (ex) R R R U D D
        String plan = sc.nextLine();
        String[] plans = plan.split(" ");
        
        //이동 방향 정의
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] move = {'L', 'R', 'U', 'D'};
        
        //이동 계획 확인
        for (int i=0; i<plans.length; i++) {
            char p = plans[i].charAt(0);
            //이동 좌표 확인
            for (int j=0; j<move.length; j++) {
                if (p == move[j]) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            if (nx < 1 || ny < 1 || nx > n || ny > n) continue;
            x = nx;
            y = ny;
        }
        //결과 출력
        System.out.println(x + " " + y);
    }
}