class this_eg
{
    int a,b;//instance variable
    this_eg(int a,int b)//local variable
    {
        this.a = a;
        this.b = b;
    }
    void disp()
    {
        System.out.println(a+" "+b);
    }
    
}
class this_main
{
    public static void main(String args[])
    {
        this_eg ob = new this_eg(20,40);
        ob.disp();
    }
}