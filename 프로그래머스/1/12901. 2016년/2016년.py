def solution(a, b):
    months: list[int] = [31,29,31,30,31,30,31,31,30,31,30,31]
    days: list[str] = ["FRI","SAT","SUN","MON","TUE","WED","THU"]
    k: int = sum(months[:a-1]) + b - 1
    print(k)
    return days[k % 7]