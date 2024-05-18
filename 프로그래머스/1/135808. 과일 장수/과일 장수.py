def solution(k, m, score):
    answer: int = 0
    score.sort(reverse = True)
    box: list[list[int]] = []
    for i in range(0, len(score), m):
        box.append(score[i:i+m])
    for apple in box:
        if len(apple) == m:
            answer += min(apple) * m
    return answer