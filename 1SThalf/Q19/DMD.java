// Example of Runtime polymorphism done by method 
//overridding(DMD)
class Parent
{
	void display()
	{
		System.out.println("This is the parent class method");
	}
}
class Child1 extends Parent
{
	void display()
	{
		System.out.println("This is the Child1 class method");
	}
}
class Child2 extends Parent
{
	void display()
	{
		System.out.println("This is the Child2 class method");
	}
}
class DMD
{
	public static void main(String args[])
	{
		Parent p=new Parent();
		p.display();
		Child1 ob1=new Child1();
		Child2 ob2=new Child2();
		ob1.display();
		ob2.display();
		p=ob1;//the object Child1 has been referred 
		     //by Parents reference variable p
		p.display();
		p=ob2; //the object Child2 has been referred
		       // by Parents reference variable p
		p.display();
	}
}