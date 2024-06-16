def solution(rsp):
    answer = ''
    for i in rsp:
        if i == "2":
            answer += "0"
            continue
        if i == "0":
            answer += "5"
            continue
        answer += "2"
    return answer