def solution(num_list):
    a = 1
    for i in num_list:
        a *= i
    if sum(num_list)**2 > a:
        return 1
    return 0