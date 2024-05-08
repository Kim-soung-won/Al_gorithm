def solution(arr):
    mini = min(arr)
    arr.remove(mini)
    if not arr:
        return [-1]
    return arr