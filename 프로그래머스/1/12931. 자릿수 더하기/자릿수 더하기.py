def solution(s):
    count: int = 0
    while (s>0):
        count += s % 10
        s //= 10
    return count