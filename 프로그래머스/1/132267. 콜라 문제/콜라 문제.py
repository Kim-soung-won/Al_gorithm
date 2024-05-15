def solution(a, b, n):
    answer: int = 0
    while n >= a:
        temp = n%a
        n = (n//a)*b
        answer += n
        n += temp
    return answer