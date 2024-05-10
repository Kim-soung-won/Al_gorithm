import sys

def solution(n,m):
    arr: list[int] = [min(n, m), max(n, m)]
    answer: list[int] = [biggest(arr[0], arr[1]), smallest(arr[0], arr[1])]
    return answer


def smallest(n: int, m: int) -> int:
    # 최소 공배수
    for i in range(1, m * n):
        if i % n ==0 and i % m == 0:
            return i
    return m*n


def biggest(n: int, m: int) -> int:
    # 최대 공약수
    nlist: list[int] = []
    mlist: list[int] = []
    for i in range(1, n // 2 + 1):
        if n % i == 0:
            nlist.append(i)
    nlist.append(n)
    for i in range(1, (m // 2 + 1)):
        if m % i == 0:
            mlist.append(i)
    mlist.append(m)
    maxi = 0
    for i in range(len(nlist)):
        if nlist[i] in mlist:
            if nlist[i] > maxi:
                maxi = nlist[i]
    return maxi