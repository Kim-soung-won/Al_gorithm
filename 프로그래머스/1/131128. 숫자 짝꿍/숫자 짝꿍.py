def solution(X, Y):
    x: dict = ditt(X)
    y: dict = ditt(Y)
    z: dict = {}
    for s in x:
        if s in y:
            z[s] = min(x[s],y[s])
    if not z:
        return "-1"
    arr = list(z)
    if arr[0] == '0':
        return "0"
    arr.sort(reverse=True)
    str1 = ""
    for i in arr:
        for j in range(z[i]):
            str1 += str(i)
    return str1

def ditt(string: str) -> dict:
    x: dict = {}
    for i in string:
        if i not in x:
            x[i] = 1
            continue
        x[i] += 1
    return x