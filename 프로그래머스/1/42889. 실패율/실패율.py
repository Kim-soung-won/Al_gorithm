def solution(N, stages):
    answer: dict = {}
    for i in range(1, N + 1):
        count: int = stages.count(i)
        count2: int = len([x for x in stages if x > i])
        if count == 0:
            answer[i] = 0
        elif count2 == 0:
            answer[i] = count
        else:
            answer[i] = count / count2
    sorted_value = sorted(answer.items(), key=lambda item: item[1], reverse=True)
    return [x[0] for x in sorted_value]