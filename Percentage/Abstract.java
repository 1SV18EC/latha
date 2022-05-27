package switchstatement;
abstract class Bank1
{
 abstract float getRateOfTnterest();
	void display()
	{
		System.out.println("Abstract class");
	}
}
class SBI1 extends Bank1
{
	@Override
	float getRateOfTnterest() {
		return 7.5f;
	}
}

class HDFC1 extends Bank1
{
	@Override
	float getRateOfTnterest() {
		return 6.8f;
	}
}

class ICICI1 extends Bank1{
	@Override
	float getRateOfTnterest() {
		return 7.0f;
	}
}
public class Abstract {

	public static void main(String[] args) {
		HDFC1 h1=new HDFC1();
		System.out.println("Rate of Interest HDFC is "+h1.getRateOfTnterest());
		h1.display();
		
		Bank1 s=new ICICI1();
		s.display();
		System.out.println("Rate of Interest ICICI is "+s.getRateOfTnterest());

	}

}
