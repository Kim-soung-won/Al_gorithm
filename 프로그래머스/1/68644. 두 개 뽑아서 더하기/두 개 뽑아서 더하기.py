def solution(numbers):
    answer: set = set()
    numbers.sort()
    for i in range(len(numbers)-1):
        for j in range(i, len(numbers)):
            if i == j:
                continue
            answer.add(numbers[i] + numbers[j])
    return sorted(list(answer))
