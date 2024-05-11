def solution(s):
    arr: dict[str, int] = {}
    answer: list[int] = []
    for i in range(len(s)):
        if arr.get(s[i]) is not None:
            answer.append(i-arr.get(s[i]))
            arr[s[i]] = i
        else:
            answer.append(-1)
            arr[s[i]] = i
    return answer