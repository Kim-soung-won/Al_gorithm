def solution(k, score):
    answer: list[int] = []
    que: list[int] = []
    if k > len(score):
        for i in range(len(score)):
            que.append(score[i])
            answer.append(min(que))
        return answer
    for i in range(k):
        que.append(score[i])
        answer.append(min(que))
    que.sort()
    for i in score[k::]:
        if que[0] < i:
            que[0] = i
            que.sort()
        answer.append(que[0])
    return answer