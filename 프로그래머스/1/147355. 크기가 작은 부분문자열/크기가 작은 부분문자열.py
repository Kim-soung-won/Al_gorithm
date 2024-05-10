def solution(t, p):
    answer = 0
    arr = list(t)
    for i in range(len(t)-len(p)+1):
        if int(p) >= int("".join(arr[i:len(p)+i])):
            print(int("".join(arr[i:len(p)+i])))
            answer += 1
    return answer