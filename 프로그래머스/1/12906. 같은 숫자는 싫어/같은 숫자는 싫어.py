def solution(arr):
    answer: list[int] = []
    for i in range(len(arr)):
        if not answer:
            answer.append(arr[i])
            continue
        if answer[len(answer) - 1] != arr[i]:
            answer.append(arr[i])
    return answer