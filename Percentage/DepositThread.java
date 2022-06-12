package switchstatement;

public class DepositThread extends Thread {
SynchronizedClass obj;
int amt;String msg;
public DepositThread(SynchronizedClass obj,int amt) {
	this.obj=obj;
	this.amt=amt;
}
@Override
public void run() {
	try {
		Thread.sleep(2000);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	 obj.deposit(amt);
}

}
