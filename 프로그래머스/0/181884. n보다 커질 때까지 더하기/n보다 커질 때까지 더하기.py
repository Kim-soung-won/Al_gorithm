def solution(numbers, n):
    answer: int = 0
    for i in numbers:
        answer += i
        if answer>n:
            return answer
    return answer