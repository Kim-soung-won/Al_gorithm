def solution(k, m, score):
    answer: int = 0
    score.sort()
    for i in range(len(score)//m):
        box: list[int] = []
        for j in range(m):
            box.append(score.pop())
        answer += min(box) * m
    return answer