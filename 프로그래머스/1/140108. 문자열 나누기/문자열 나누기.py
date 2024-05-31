def solution(s):
    answer: int = 0
    first: dict = {}
    start: str = ''
    el: str = 'else'
    for i in s:
        if not first:
            start = i
            first[start] = 1
            print("start : ", first[start], "spell : ", i)
            continue
        if start == i:
            first[start] += 1
            print("start : ", first[start])
            continue
        if start != i:
            if el not in first:
                first[el] = 0
            first[el] += 1
        if first[el] == first[start]:
            first: dict = {}
            answer +=1
    if first:
        answer += 1
    return answer