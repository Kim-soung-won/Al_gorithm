def solution(n, lost, reserve):
    answer = 0
    tt = 0 # 다음학생한테 줄 옷
    for i in range(1, n+1):
        if i not in lost and i not in reserve or i in lost and i in reserve: # 당장 본인거만 책임
            answer += 1
            tt = 0 # 다음 학생에게 줄 것 없음
            continue
        elif i in lost and tt==1: # 이전 학생에 여분 있음
            answer += 1
            tt = 0   # 여분 사용
        elif i in reserve: # 여분 있음
            if tt>=0:       # 이전 학생이 요구하지 않음
                answer += 1
                tt= 1       # 다음 학생을 위한 여분 남겨둠
            else:           # 이전 학생이 요구함
                answer += 2 
                tt = 0      # 다음 학생을 위한 여분 없음
            continue
        else:               # 부족한데, 여분도 없음
            tt = -1
            continue
    return answer