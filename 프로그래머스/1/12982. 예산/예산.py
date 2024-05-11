def solution(d, budget):
    d.sort()
    count: int = 0
    for i in range(len(d)):
        budget -= d[i]
        if budget < 0:
            return count
        count +=1
    return count