def solution(n):
    result: list[int] = []
    while n :
        result.append(n % 3)
        n //= 3
    print(result)
    result.reverse()
    answer: int = 0
    for i in range(len(result)):
        answer += (3**i)*result[i]
    return answer