package switchstatement;

public class MultiplecatchBlock {

	public static void main(String[] args) {
	try {
		int a[]=new int[5];
		a[5]=30/0;
	}
catch(ArithmeticException e)
	{ 
	System.out.println("task1 is Completed");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("task2 is Completed");
	}
	catch(Exception e) {
		System.out.println("common task completed");
	}
	System.out.println("rest of the code....");
	}

}
