package switchstatement;

public class StudentIdNotfoundException extends Exception 
{
	 int sid;
	 StudentIdNotfoundException()
	 {
		 
	 }
	public StudentIdNotfoundException(int sid) 
	{
		this.sid = sid;
	}
	 @Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "student with id "+sid+" Not found";
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student id not Found";
	}
	
}