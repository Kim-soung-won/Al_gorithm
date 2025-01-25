function solution(numbers) {
    var result = new Set();
    numbers.map(function (num, index) {
        numbers.map(function (num2, index2) {
            if (index !== index2) {
                result.add(num + num2);
            }
        });
    });
    return Array.from(result).sort(function (a, b) { return a - b; });
}