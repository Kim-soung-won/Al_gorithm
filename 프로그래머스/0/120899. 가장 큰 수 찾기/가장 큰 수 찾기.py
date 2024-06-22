def solution(array):
    dic: dict = {}
    for index, i in enumerate(array):
        dic[i] = index
    return [max(array), dic[max(array)]]