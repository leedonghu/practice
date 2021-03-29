package practice;

public class practice_두개뽑아서더하기 {
	function solution(participant, completion) {
	    var answer = '';
	    var part = participant.sort();
	    var comp = completion.sort();
	    for (var i=0; i<participant.length; i++){
	       
	        if (part[i] !== comp[i]) {
	            answer = part[i];
	            return answer;
	        }  
	    }
	        
	    
	    
	}
}
