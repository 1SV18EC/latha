package switchstatement;

public class Account {
static int Balance=2000;
	public static void main(String[] args) {
		SynchronizedClass sc=new SynchronizedClass();
		
		DepositThread dt1=new DepositThread(sc,10000);
		DepositThread dt2=new DepositThread(sc,15000);
		
		dt1.start();
		dt2.start();
		try {
			dt1.join();
			dt2.join();
		}catch(Exception e) {
		System.out.println(e);
	}
	System.out.println("Total balance is"+Balance);
}
}
