def solution(a, b):
    if (a+b)%2 == 1:
        return (a+b)*2
    else:
        if a%2==1 or b%2 == 1:
            return a**2 + b**2
        return abs(a-b)
    return answer