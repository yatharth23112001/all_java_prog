class try_catch
{
	public static void main(String args[])
	{
		int x=12;
		int y=2;

		try
		{
			int z=x/y;

			System.out.println("The result is "+z);

		}

		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Thankyou");
		}

	}
}