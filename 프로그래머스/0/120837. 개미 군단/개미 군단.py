def solution(hp):
    answer = 0
    ant: list[int] = [5,3,1]
    for i in ant:
        while hp >= i:
            answer += 1
            hp -= i
    return answer