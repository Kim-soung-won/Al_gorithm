def solution(n, arr1, arr2):
    temp: list[int] = []
    answer: list[str] = []
    for i in range(n):
        temp.append(arr1[i] | arr2[i])
    print(temp)
    for i in range(n):
        str1 = []
        for j in range(n):
            if temp[i] % 2 == 1:
                str1.append('#')
            else:
                str1.append(' ')
            temp[i] //= 2
        answer.append(''.join(reversed(str1)))
    return answer