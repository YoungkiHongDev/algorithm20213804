# 2주차 거스름 돈 문제 Python

n = 1260
cnt = 0

# 큰 동전부터 차례대로 확인
array = [500, 100, 50, 10]

for coin in array:
    # 해당 동전으로 거슬러 줄 수 있는 개수 세기
    cnt += n // coin

    # 거슬러주고 남은 나머지
    n %= coin

print(cnt)