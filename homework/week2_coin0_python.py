# 백준 11047번 문제 - 동전0
NK = input() #동전의 종류와 총합 입력받기 ex) 10 4200
N = int(NK.split(' ')[0]) #공백을 기준으로 잘라서 동전의 종류 저장
K = int(NK.split(' ')[1]) #공백을 기준으로 잘라서 동전의 총합 저장

cnt=0 #동전의 개수를 저장할 변수
coin=[] #동전의 단위를 저장할 리스트

#동전의 종류만큼 for문 돌리기
for i in range(N) :
    coin.append(int(input())) #동전의 단위를 입력받아 리스트에 저장

#동전의 단위 리스트를 역순으로 조회하는 for문 돌리기
for i in reversed(coin) :
    cnt += K//i #동전의 개수 저장
    K %= i #나머지 저장

print(cnt) #동전의 총 개수 출력