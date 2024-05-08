def solution(left, right):
    result: int = 0
    for k in range(left, right + 1):
        count: int = 0
        for p in range(1, (k // 2) +1):
            if k % p == 0:
                count += 1
        if (count + 1) % 2 == 0:
            result += k
        else:
            result -= k
    return result