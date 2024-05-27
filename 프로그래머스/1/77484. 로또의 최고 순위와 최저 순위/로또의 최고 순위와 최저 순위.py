def solution(lottos, win_nums):
    check: dict = {6:1, 5:2, 4:3, 3:4, 2:5, 1:6, 0:6}
    ss: int = 0
    zero: int = lottos.count(0)
    for i in lottos:
        if i == 0:
            continue
        if i in win_nums:
            ss +=1
    return [check[ss+zero], check[ss]]