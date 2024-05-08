def solution(n):
    answer: str = ""
    str1: list[str] = ["수", "박"]
    for i in range(n):
        answer += str1[i%2]
    return answer