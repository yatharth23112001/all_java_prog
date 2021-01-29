class A
{
    int a=50;
}
class B extends A
{
    int b = a*a;    
}
class C extends B
{
    void display()
    {
        System.out.println("The value of a="+a);
        System.out.println("The value of b="+b);
    }
}
class Multi_Inherit
{
    public static void main(String args[])
    {
        C ob = new C();
        ob.display();
    }
}