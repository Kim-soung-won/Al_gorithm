function solution(numbers) {
    var num1 = [1, 2, 3, 4, 5];
    var num2 = [2, 1, 2, 3, 2, 4, 2, 5];
    var num3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
    var numCount = [0, 0, 0];
    numbers.forEach(function (num, index) {
        if (num1[index % num1.length] === num) {
            numCount[0]++;
        }
        if (num2[index % num2.length] === num) {
            numCount[1]++;
        }
        if (num3[index % num3.length] === num) {
            numCount[2]++;
        }
    });
    var maxCount = Math.max.apply(Math, numCount);
    var answer = [];
    numCount.forEach(function (num, index) {
        if (num === maxCount) {
            answer.push(index+1);
        }
    });
    return answer;
}