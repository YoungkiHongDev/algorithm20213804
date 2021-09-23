// 3주차 과제 문제3) 백준 문제 11399번 ATM Java
// 전제조건
// ATM 1대만 사용
// 대기하는 사람 다수
// 1번째 사람이 1분 사용하고 2번째 사람이 2분 사용하면
// 2번째 사람은 앞의 사람의 사용시간 1분을 대기하고 사용
// 3번째 사람은 앞의 2명의 사용시간 3분을 대기하고 사용함
// 사용시간이 적은 사람이 앞에가면 뒷사람들의 대기시간 감소
// 따라서 사용시간이 적은 사람부터 ATM을 쓰도록 프로그램 작성
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in); //입력받을 스캐너

        int wait = sc.nextInt(); //총 대기인원 입력 받기
        sc.nextLine(); //nextInt의 개행문자 제거
        String use = sc.nextLine(); //각 사용시간 입력 받기
        int time = 0; //총 사용 및 대기시간을 저장할 변수
        String[] using = use.split(" "); //사용시간 공백으로 자르기
        int[] waiting = new int[wait]; //총 대기인원만큼 배열 생성
        
        //대기인원 크기 배열에 각 사용시간 저장하기
        for(int i=0; i<waiting.length; i++) {
            waiting[i] = Integer.parseInt(using[i]);
        }

        Arrays.sort(waiting); //사용시간 오름차순 정렬
        int arrsize = waiting.length; //배열 크기 저장

        //총 사용 및 대기시간 구하기
        //첫번째는 배열크기만큼 더하고
        //다음번째로 갈수록 배열크기에서 -1하여 더하므로
        //배열값과 arrsize를 곱한만큼 time에 더해주고
        //다음배열로 갈수록 arrsize를 -1 해준다.
        for(int i=0; i<waiting.length; i++) {
            time += waiting[i]*arrsize;
            arrsize--;
        }

        System.out.println(time); //결과 출력
    }
}