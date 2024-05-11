def solution(s, n):
    answer: str = ""
    for i in range(len(s)):
        if 'A' <= s[i] <= 'Z':
            answer += chr(((ord(s[i]) - 65 + n)%26) + 65)
        elif 'a' <= s[i] <= 'z':
            answer += chr(((ord(s[i]) - 97 + n)%26) + 97)
        else:
            answer += " "
    return answer