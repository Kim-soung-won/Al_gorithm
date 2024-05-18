def solution(answers):
    man1: list[int] = [1, 2, 3, 4, 5]
    man2: list[int] = [2, 1, 2, 3, 2, 4, 2, 5]
    man3: list[int] = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    scores: list[int] = [0, 0, 0]
    answer: list[int] = []
    for i, num in enumerate(answers):
        if num == man1[i % len(man1)]:
            scores[0] += 1
        if num == man2[i % len(man2)]:
            scores[1] += 1
        if num == man3[i % len(man3)]:
            scores[2] += 1
    maxi: int = max(scores)
    for i, num in enumerate(scores):
        if num == maxi:
            answer.append(i+1)
    return answer