// 4주차 과제 배열 값 중 0값을 찾아 뒤로 배치시키기 Java
import java.util.Arrays;

public class Main {
    //배열 재배치를 위한 함수
    public static void reorder(int[] arr, int n) {
        int j = 0; //숫자값을 차례대로 넣기 위한 변수
        //배열에 숫자값을 차례대로 넣기 위한 반복문
        for (int i : arr) { //변수 i에 배열 arr의 원소가 순서대로 들어감
            //만약 숫자값일 경우
            if (i != 0) {
                arr[j] = i; //arr의 j값 위치에 arr의 숫자 원소 삽입
                j++; //j값을 다음 위치로 증가시키기
            }
        }
        //배열의 나머지 공간 0으로 채우기
        for (int i = j; i < n; i++) {
            arr[i] = 0;
        }
    }

    //메인 함수
    public static void main(String[] args)
    {
        int[] arr = {6, 0, 8, 2, 3, 0, 4, 0, 1}; //배열 초기값
        int n = arr.length; //배열의 크기 저장
        reorder(arr, n); //재배치 함수 호출
        System.out.println(Arrays.toString(arr)); //결과 출력
    }
}