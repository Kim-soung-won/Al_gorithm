def solution(s):
    arr = s.split(" ")
    arr = list(map(int,arr))
    return str(min(arr)) +" "+ str(max(arr))