package switchstatement;
class Bank{
	float getRateOfInterest() {
		return 6.7f;
	}
}
class SBI extends Bank{

	@Override
	float getRateOfInterest() {
		return 7.5f;
	}
	
}

class HDFC extends Bank{

	@Override
	float getRateOfInterest() {
		return 6.8f;
	}
	
}

class ICICI extends Bank{

	@Override
	float getRateOfInterest() {
		return 7.0f;
	}
	
}
public class MethodOverriding {

	public static void main(String[] args) {
		SBI obj=new SBI();
		System.out.println(obj.getRateOfInterest());
		
		Bank obj1=new HDFC();
		System.out.println(obj1.getRateOfInterest());

	}

}
