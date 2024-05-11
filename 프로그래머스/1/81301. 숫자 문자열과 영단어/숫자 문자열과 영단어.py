def solution(s):
    arr: list[str] = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
    check: str = ""
    answer: str = ""
    for i in range(len(s)):
        if s[i].isnumeric():
            answer += s[i]
        else:
            check += s[i]
        if check in arr:
            answer += str(arr.index(check))
            print("index = ", arr.index(check))
            check = ""
    return int(answer)