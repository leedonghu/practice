package practice;

public class practice_나누어떨어지는숫자 {

}
function solution(arr, divisor) {
    var answer = [];
    var div;
    for (var i=0; i<arr.length; i++){
        if ( arr[i]% divisor ==0){
            answer.push(arr[i]);
        }
    }
    if (answer.length == 0){
        answer.push(-1);
    }
    answer.sort(function(a, b) {return a-b});
    return answer;
}