def solution(babbling):
    answer = 0
    str1 = ["aya","ye","woo","ma"]
    for i in babbling:
        for j in str1:
            if j*2 not in i:
                i = i.replace(j," ")
            if i.isspace():
                answer += 1
                break
    return answer

    
    