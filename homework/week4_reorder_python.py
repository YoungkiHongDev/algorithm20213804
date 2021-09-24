# 4주차 과제 배열 값 중 0값을 찾아 뒤로 배치시키기 Python
# 재배치하기 위한 함수
def reorder(arr, n):
    j = 0 # 숫자값을 차례대로 저장시키기 위한 변수
    # 숫자값을 차례대로 저장시키기 위한 for문
    for i in range(n):
        # 숫자값이면 저장하고 J++
        if arr[i] != 0:
            arr[j] = arr[i]
            j += 1
            
    # 0값을 나머지 공간에 저장시키기 위한 for문
    for i in range(j, n):
        arr[i] = 0

arr = [6, 0, 8, 2, 3, 0, 4, 0, 3] # 배열 초기화
n = len(arr) # 배열의 크기 저장
reorder(arr, n) # 배열을 재배치하기 위한 함수 호출
print(arr) # 결과 출력