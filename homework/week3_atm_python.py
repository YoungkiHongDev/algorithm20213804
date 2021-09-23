# 3주차 과제 문제3) 백준 문제 11399번 ATM Python
wait = int(input()) # 총 대기인원 입력받기
use = list(map(int, input().split())) # 각 사용시간 리스트에 입력받기

use.sort() # 리스트 오름차순 정렬

time=0 # 총 사용 및 대기 시간을 저장할 변수

# 총 사용 및 대기 시간 구하기
for i in range(0, len(use)):
    time += use[i]*wait
    wait -= 1

print(time) # 결과 출력