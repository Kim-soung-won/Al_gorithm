def solution(array, commands):
    answer: list[int] = []
    for i in range(len(commands)):
        arr: list[int] = array[commands[i][0] - 1:commands[i][1]]
        arr.sort()
        print("arr : ", arr)
        print("value : ", commands[i][2])
        answer.append(arr[commands[i][2] - 1])
        print("answer : ", answer)
    return answer