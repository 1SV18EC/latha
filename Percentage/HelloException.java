package switchstatement;
import java.io.IOException;

class HelloException
{
void m()throws IOException
{
throw new IOException("device error");//checked exception
}
void n()throws IOException
{
m();
}
void p()
{
try
{
n();
}
catch(Exception e){System.out.println("exception handled");}
}
public static void main(String args[])
{
HelloException obj=new HelloException();
obj.p();
System.out.println("normal flow...");
}
}