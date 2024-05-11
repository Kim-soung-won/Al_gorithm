def solution(number):
    number.sort()
    answer: int = 0
    if len(number) < 3 or len(number) > 14:
        return "제한사항"
    for i in range(len(number)-2):
        left = i+1
        right = len(number)-1
        while left < right:
            if number[i] + number[left] + number[right] < 0:
                left += 1
            elif number[i] + number[left] + number[right] > 0: 
                right -=1
            else :
                if number[left] != number[right]: 
                    left_count, right_count = 1, 1
                    while left < right and number[left] == number[left + 1]:
                        left += 1
                        left_count += 1
                    while left < right and number[right] == number[right - 1]:
                        right -= 1
                        right_count += 1
                    answer += left_count * right_count
                    left += 1
                    right -= 1
                else: 
                    answer += (right - left + 1) * (right - left) // 2
                    break
    return answer