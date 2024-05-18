def solution(name, yearning, photo):
    answer: list[int] = []
    for i in range(len(photo)):
        count: int = 0
        for j in photo[i]:
            if name.__contains__(j):
                count += yearning[name.index(j)]
        answer.append(count)
    return answer