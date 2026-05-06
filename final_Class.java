class final_class
{
    public static void main(String A[])
    {
        Hello hobj = new Hello();
        Demo dobj = new Demo();     // Allowed
    }
}

final class Demo
{
   
    public void fun()
    {
        System.out.println("Inside Demo Fun");
    }

    public void gun()
    {
        System.out.println("Inside Demo gun");
    }
}

class Hello extends Demo        // Error
{
    public void gun()
    {
        System.out.println("Inside Hello gun");
    }
}