package switchstatement;

public class ForEach
{
		public static void main(String args[])
		{
		//for each loop to traverse integer array
		int s[] = {18,25,28,29,30};
		for (int i : s)
		{
			int a=i;
		System.out.print(a);
		System.out.print(" ");
		}
		System.out.println();
		//for each loop to traverse character array
		char ch[] = {'L','a','t','h','a'};
		for (char ch1 : ch)
		{
			char a=ch1;
		System.out.print(a);
		System.out.print(" ");
		}
		}
}

