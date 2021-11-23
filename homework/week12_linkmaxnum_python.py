def arrsort(arr):
    # 람다 함수로 비교하여 내림차순 정렬
    arr.sort(key=lambda x: x*3, reverse = True)
    return arr

arr = ["10", "68", "75", "7", "21", "12"]
arrsort(arr)

for i in arr:
    print(i, end='')