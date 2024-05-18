def solution(nums):
    answer = set(nums)
    if len(nums)//2 < len(answer):
        return len(nums)//2
    return len(answer)