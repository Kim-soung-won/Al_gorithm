def solution(n_str):
    for i in n_str:
        if i == "0":
            n_str = n_str[1:]
        else:
            return n_str