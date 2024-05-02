def solution(n):
    result: list[int] = []
    while (n>0):
        result.append(n%10)
        n //= 10
    return result