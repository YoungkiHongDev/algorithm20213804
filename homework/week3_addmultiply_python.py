# 3주차 과제 문제2) 곱하기 혹은 더하기 Python

num = input() # 문자열로 된 숫자 입력받기
num1 = int(num[0]) # 첫글자 숫자로 변경해서 저장

# 남은 숫자 개수만큼 for문 돌리기
for i in range(1, len(num)):
    num2 = int(num[i]) # 뒷글자 숫자로 변경해서 저장

    # 앞뒤 숫자 중 하나가 0~1이면 더하기, 아니면 곱하기
    if num1 <= 1 or num2 <= 1:
        num1 += num2 # 더하기 수행
    else:
        num1 *= num2 # 곱하기 수행

print(num1) # 결과 출력