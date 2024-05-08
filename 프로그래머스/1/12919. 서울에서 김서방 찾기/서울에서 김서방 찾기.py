def solution(seoul):
    for i, name in enumerate(seoul):
        if name == "Kim":
            return "김서방은 "+str(i)+"에 있다"