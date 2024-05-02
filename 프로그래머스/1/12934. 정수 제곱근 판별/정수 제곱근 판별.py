def solution(n):
    if (n**0.5 - int(n**0.5)) != 0 :
        return -1
    return int(((n**0.5)+1)**2)
