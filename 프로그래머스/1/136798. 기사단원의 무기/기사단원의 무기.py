def solution(number, limit, power):
    answer: int = 0
    for i in range(1, number + 1):
        nums: list[int] = []
        for j in range(1, int((i**0.5)+1)):
            if i % j == 0:
                nums.append(j)
                if j != i//j:
                    nums.append(i//1)
        if len(nums) > limit:
            answer += power
        else:
            answer += len(nums)
    return answer