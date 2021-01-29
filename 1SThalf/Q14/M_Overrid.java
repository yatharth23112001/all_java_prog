class Parent
{
    int a =15,b=30;
    void display()
    {
        int c=a+b;
        System.out.println("The sum is "+c);
    }
}
class Child extends Parent
{
    void display()
    {
        super.display();
        int d=a*b;
        System.out.println("The product is "+d);
    }
}
class M_Overrid
{
    public static void main(String args[])
    {
        Child ob = new Child();
        ob.display();
    }
}