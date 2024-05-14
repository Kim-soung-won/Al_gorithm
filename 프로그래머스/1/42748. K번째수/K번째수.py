def solution(array, commands):
    answer: list[int] = []
    for command in commands:
        l, j, k = command
        answer.append(list(sorted(array[l - 1:j]))[k - 1])
    return answer