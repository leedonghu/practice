package practice;

public class practice_두정수사이합 {

}
function solution(a, b) {
    var answer = 0;
    
    for (var i = Math.min(a, b); i<=Math.max(a,b); i++){
        answer += i;
    }
    return answer;
}