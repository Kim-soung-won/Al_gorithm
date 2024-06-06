def solution(s, skip, index):
    answer = ''
    skip_set = set(skip)  
    for i in s:
        steps = 0
        while steps < index:
            i = chr((ord(i) - 97 + 1) % 26 + 97)  
            if i not in skip_set:
                steps += 1
        answer += i
    return answer