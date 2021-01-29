class A
{
    int a=10;
}
class B extends A{
    int a=20;
    void disp()
    {
        System.out.println(a);
        System.out.println(super.a);
    }
}
class C
{
    public static void main(String ab[])
    {
            B ob = new B();
            ob.disp();
    }
}