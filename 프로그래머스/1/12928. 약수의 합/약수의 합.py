def solution(s):
    count = set()
    if s == 1:
        return s
    for i in range(1, int(s/2)+1):
        if s%i == 0:
            count.add(i)
            count.add(int(s/i))
    return sum(count)