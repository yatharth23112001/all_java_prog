class try_mul_catch
{
	public static void main(String args[])
	{
		int x=12;
		int y=4;
		int p[]={10,4,6,2};
		try
		{
			int z=x/y;

			System.out.println("The result is "+z);
			p[17]=10;
		}

		catch(ArithmeticException e)
		{
			System.out.println("This results to infinity");
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array overflow");
		}

	}
}