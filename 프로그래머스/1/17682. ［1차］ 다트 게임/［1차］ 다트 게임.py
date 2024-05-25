def solution(dartResult: str):
    answer = []
    arr: list[str] = ['*','#']
    arr2: list[str] = ["S","D","T"]
    slices = sliceStr(dartResult, arr)
    for i, result in enumerate(slices):
        if not result[0].isdigit:
            return sum(answer)
        num = int(result[0])
        if result[1] == "0":
            result = result[0] + result[2:]
            num = 10
        if result[1] == "D":
            num = num**2
        elif result[1] == "T":
            num = num**3
        if result[2] == "*":
            num *=2
            if i != 0:
                answer[-1] = answer[-1]*2
        if result[2] == "#":
            num *= -1
        answer.append(num)
    return sum(answer)

def sliceStr(dartResult, arr):
    temp = []
    while len(dartResult)>3:
        if dartResult[:2] == "10":
            str1 = dartResult[:3]
            dartResult = dartResult[3:]
        else:
            str1 = dartResult[:2]
            dartResult = dartResult[2:]
        if arr.__contains__(dartResult[0]):
            str1 += str(dartResult[0])
            dartResult = dartResult[1:]
        else:
            str1 += "O"
        temp.append(str1)
    temp.append(dartResult+"O")
    return temp