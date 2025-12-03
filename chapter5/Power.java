public class Power {
	    
	public static void main(String[] args) {
    
	}
	
	public static long Power(long num, long pow){
		if(pow == 0 ) return 1;
		else
			return num*Power(num,pow-1);
	}



}

