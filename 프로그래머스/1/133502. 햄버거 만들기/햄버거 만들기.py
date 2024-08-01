def solution(ingredient):
    stk: list[int] = []
    answer:int = 0
    for i in ingredient:
        stk.append(i)
        if stk[-4:] == [1,2,3,1]:
            for j in range(4):
                stk.pop()
            answer += 1
    return answer