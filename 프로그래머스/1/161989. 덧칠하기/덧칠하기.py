def solution(n, m, section):
    answer: int = 1
    mini: int = section[0]
    for i in section[1:]:
        if i - mini >= m:
            answer += 1
            mini = i
    return answer