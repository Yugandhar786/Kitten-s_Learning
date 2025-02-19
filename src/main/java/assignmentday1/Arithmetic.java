package assignmentday1;

public class Arithmetic { 
			public int sum(int a, int b) {
				int sum = a+b;
				return sum;	
		
	}
	
	public static void main(String[]args) {
		int a = 10;
		int b = 40;
		
		Arithmetic obj = new Arithmetic();
		int result = obj.sum(a, b);
		System.out.println("Sum is : " + result);
		
			
		// TODO Auto-generated method stub
		
	}
}
class mul extends Arithmetic{
	public static void main(String[] args) {
	      
}

	public static int mul(int a,int b) {
		// TODO Auto-generated method stub
		int mul=a*b;
		return mul;
		
		
	}
}


