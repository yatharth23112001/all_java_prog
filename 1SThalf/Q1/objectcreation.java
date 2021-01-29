class Test1
{
	int a,b;
	void input()
	{
		a=10;
		b=20;
	}
	void disp()
	{
		System.out.println("The values are "+a+" "+b);
	}
}
class Test2
{
	public static void main(String a[])
	{
		Test1 ob = new Test1();
		ob.input();
		ob.disp();
	}
}