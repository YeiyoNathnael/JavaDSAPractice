import java.util.*;
public class WellFormedSets{

	/*
Problem: determine whether a set of parentheses is “well formed”. 
Here, we will consider parenthesis pairs: ( ), [ ], { } 

◼ Examples:
◼ well-formed expressions
	◼ (xx(xx( ) )xx)
	◼ [ ] ( ) { }
	◼ ( { } { xxx} xxx ( ) xxx)
	◼ ( [ { [ ( ( [ {x} ] ) x ) ] }x ] )
◼ Ill-formed expressions
	◼ (xx(xx( ))xxx)xxx)
	◼ ] [
	◼ (xx[xxx)xx]
	
	*/

	
	public static void main(String[] args){
				
		String expression = "( [ { [ ( ( [ {x} ] ) x ) ] }x ] )";
		if(wellFormed(expression)) System.out.println("YES");
	}

	public static boolean wellFormed(String expression){
		
		Stack<Character> set = new Stack<>();
		
		for(int i = 0; i < expression.length(); i++){
			set.push(expression.charAt(i));
		}

		int full = 0;
		while(!set.isEmpty() && full>= 0){
			
			char current = set.pop();
			if(isOpen(current)) full--;
			if(isClosed(current))full++;
		}
		return full == 0;
		
		
	}
	
	public static boolean isOpen(char c ){
		return c == '{'|| c == '('|| c == '[';
	}
	public static boolean isClosed(char c ){
		return c == '}'|| c == ')'|| c == ']';
	}

}
