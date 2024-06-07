def solution(keymap, targets):
    answer: list[int] = []
    keys: dict = {}
    for i in keymap:
        for index, j in enumerate(i):
            if j not in keys:
                keys[j] = index+1
                continue
            if keys[j] > index+1:
                keys[j] = index+1
    print(keys)
    for index, i in enumerate(targets):
        answer.append(0)
        for j in i:
            if j in keys:
                answer[index] += keys[j]
            else:
                answer[index] = -1
                break
    return answer