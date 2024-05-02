def solution(n):
    result: list[int] = []
    answer: int = 0
    while n:
        result.append(n % 10)
        n = n // 10
    result.sort()
    result.reverse()
    for i in range(len(result)):
        answer *= 10
        answer += result[i]
    return answer
