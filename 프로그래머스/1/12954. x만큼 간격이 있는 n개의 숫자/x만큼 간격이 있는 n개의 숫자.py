def solution(x, n):
    result: list[int] = []
    for i in range(1, n + 1):
        result.append(x * i)
    return result