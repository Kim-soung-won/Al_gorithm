def solution(n):
    for i in range(1, n // 2):
        if n % i == 1:
            return i
    return n - 1