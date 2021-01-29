class Throweg
{
	void check(String s1)
	{
		char ch;
		ch = s1.charAt(0);
		if(ch == 'A')
		{
			System.out.println("valid Id");
		}
		else
		{
			try
			{
				throw new ArithmeticException();
			}
			catch(ArithmeticException e)
			{
				System.out.println("Invalid Id");
			}
		}
	}
}
class TCT
{
	public static void main(String args[])
	{
		Throweg ob = new Throweg();
		ob.check("Ayan");
	}
}