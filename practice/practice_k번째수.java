package practice;

public class practice_k번째수 {

}
function solution(array, commands) {
    var answer = [];
   for ( var i=0; i<commands.length;i++){
       var curCommand = commands[i];
       var startIndex = curCommand[0] - 1;
       var endIndex = curCommand[1];
       var subArray = array.slice(startIndex, endIndex);
       
       subArray.sort(function (a,b){
           return a- b;
       });
       var kthValue = subArray[curCommand[2]-1];
       answer.push(kthValue);
   }
    
    
    return answer;
    
}