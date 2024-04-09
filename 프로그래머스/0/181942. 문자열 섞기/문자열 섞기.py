def solution(str1, str2):
    result = ""
    for i in range(len(str1)):
        result += str1[i:i+1] + str2[i:i+1]
    return result