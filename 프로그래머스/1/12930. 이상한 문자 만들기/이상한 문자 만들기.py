def solution(s):
    answer: str = ""
    count: int = 0
    for i in range(len(s)):
        if count % 2 == 0:
            answer += s[i].upper()
        else:
            answer += s[i].lower()
        count += 1
        if s[i]==" ":
            count = 0
        
    return answer