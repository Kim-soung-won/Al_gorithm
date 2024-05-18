def solution(name, yearning, photo):
    answer: list[int] = []
    for i in photo:
        count: int = 0
        for j in i:
            if name.__contains__(j):
                count += yearning[name.index(j)]
        answer.append(count)
    return answer