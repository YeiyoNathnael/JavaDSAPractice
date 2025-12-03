public class Factorial {
	
    
	public static void main(String[] args) {
    
	}
	
	public static long Factorial(long number){
		if(number == 0) return 1;
		else
			return number * Factorial(number -1);
	}
}

