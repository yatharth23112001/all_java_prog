class A //Parent class
{
	int i=10;
}
class B extends A //inheriting a parent class
{
	void disp()
	{
		System.out.println(i);
	}
}
class si
{
	public static void main(String a[])
	{
		B ob = new B();
		ob.disp();
	}
}