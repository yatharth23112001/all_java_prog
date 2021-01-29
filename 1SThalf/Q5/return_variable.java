class Test1
{
	int a,b;
	void input(int x,int y)
	{
		a=x;
		b=y;
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
		Test1 ob1 = new Test1();
		Test1 ob2 = new Test1();
		ob1.input(20,40);
		ob2.input(120,400);
		ob2 = ob1;
		ob1.disp();
		ob2.disp();
	}
}