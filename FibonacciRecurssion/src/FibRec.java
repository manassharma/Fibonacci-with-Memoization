import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class FibRec {
	static int answer;

	static Map<Integer, Integer> dict = new HashMap<Integer, Integer>();
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String userInput = in.next();
		Integer userInt = Integer.parseInt(userInput);
		int temp = (int)userInt;
		int sol = findFib(temp);
		System.out.println("Fibonacci sequence is = "+sol);
	}
	
	public static int findFib(int n){
		if(dict.containsKey(n)){
			answer = dict.get(n);
			return answer;
		}
		if(n<=2){
			return 1;
		}
		else{
			answer = findFib(n-1) + findFib(n-2);
		}
		Integer mapKey = n;
		Integer mapValue = answer;
		dict.put(mapKey, mapValue);
		
		return answer;
	}
}
