# 3주차 과제 문제1) 1이 될 때까지 Python

n, k = map(int, input().split()) #N값, K값 입력 받기
result = 0 # 수행 횟수를 저장할 변수

# 무한 루프
while True:
    # N을 K로 나눴을 때 나머지가 있을 경우
    if n % k >= 1:
        n -= 1 # 1번 작업 1빼기 수행
    # N을 K로 나눴을 때 나머지가 없을 경우
    else:
        n //= k # 2번 작업 K로 나누기 수행
    result += 1 # 수행 횟수 증가
    if n < k:
        break # 더이상 N을 K로 나눌 수 없을 경우 탈출

result += (n - 1) # N값 1을 제외하고, 남은 수행 횟수 더하기
print(result) # 결과 출력