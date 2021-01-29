abstract class Parent {
    abstract void display1();//abstract method

    void display2()//normal method
    {
        System.out.println("Testing for abstrcat class");
    }
}
class Child extends Parent{
    void display1()
    {
        System.out.println("This body is provided by child class");
        
    }
    void display3()
    {
        System.out.println("Child");
    }
}
class Abst_Testing
{
    public static void main(String a[])
    {
        Child t = new Child();
        t.display1();
        t.display2();
        t.display3();
    }
    
}