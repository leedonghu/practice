package practice;

public class practice_모의고사 {

}function solution(answers) {
    var answer = [];
    var ans1 = [1, 2, 3, 4, 5];
    var ans2 = [2, 1, 2, 3, 2, 4, 2, 5];
    var ans3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
    
    var get1 = 0;
    var get2 = 0;
    var get3 = 0;
    
    for (var i = 0; i<answers.length; i++){
        if (ans1[i%5] == answers[i]){
            get1++;
        }
    }
    for (var i=0; i<answers.length; i++){
        if (ans2[i%8] == answers[i]) {
            get2++
        }
    }
    for (var i = 0; i<answers.length; i++){
        if (ans3[i%10] == answers[i]) {
            get3++
        }
    }
    
    var compare = [get1, get2, get3 ];
    
    var max = Math.max(get1, get2, get3);
   var result = [];
    if (max == get1){result.push(1);}
    if (max == get2){result.push(2);}
    if (max == get3){result.push(3);}
    
    
    return result;
}
