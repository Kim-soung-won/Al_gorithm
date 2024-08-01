def solution(board, moves):
    stk: list[int] = []
    answer: int = 0
    for i in moves:
        for j in range(len(board)):
            if board[j][i-1] != 0:
                stk.append(board[j][i-1])
                board[j][i-1] = 0
                break
        if len(stk) > 1:
            if stk[-1] == stk[-2]:
                stk.pop()
                stk.pop()
                answer += 2
    return answer