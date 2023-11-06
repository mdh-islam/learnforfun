package practice;

public class Fibonachi {

	public static void main(String[] args) {

		int maxNumber = 10;
		int previousNumber =0;
		int nextNumber =1;
		
		for(int i = 1;i<=maxNumber; i++) {
			System.out.println(previousNumber);
			
			int sum= previousNumber + nextNumber;
			
			previousNumber = nextNumber;
			
			nextNumber = sum;
		}
		

	}

}
