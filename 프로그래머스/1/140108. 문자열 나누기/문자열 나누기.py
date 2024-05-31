def solution(s):
    answer: int = 0
    alpha: dict = {}
    maxi = 0
    for index, i in enumerate(s):
        if i not in alpha:
            alpha[i] = 1
            if maxi == 0:
                maxi = 1
            elif maxi == 1:
                print("index: ", index,"key: ",i, "alpha[i] : ",alpha[i],"  maxi : ",maxi)
                maxi = 0
                alpha: dict = {}
                answer += 1
        else:
            alpha[i] += 1
            if alpha[i] == maxi:
                print("index: ", index,"key: ",i, "alpha[i] : ",alpha[i],"  maxi : ",maxi)
                alpha: dict = {}
                maxi = 0
                answer += 1
                continue
            if maxi < alpha[i]:
                maxi = alpha[i]
    if maxi != 0:
        answer += 1
        
    return answer