def solution(s):
    if s == 1:
        return 1
    return s + sum([i for i in range(1, s//2 + 1) if s % i == 0])