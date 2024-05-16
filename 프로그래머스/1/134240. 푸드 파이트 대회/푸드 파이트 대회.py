def solution(food):
    left: str = ""
    right: str = ""
    for i in range(1,len(food)):
        temp: int = food[i]//2
        if temp > 0:
            while temp > 0:
                left += str(i)
                right += str(i)
                temp -= 1
    answer = left + "0" + right[::-1]
    return answer