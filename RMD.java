class Base
{
    public int i,j;

    public void fun()
    {
        System.out.println("Inside Base fun");
    }

    public void gun()
    {
        System.out.println("Inside Base fun");
    }

    public void sun()
    {
        System.out.println("Inside Base fun");
    }
}

class Derived extends Base
{
    public int x,y;

    public void gun()
    {
        System.out.println("Inside Derived gun");
    }

    public void sun()
    {
        System.out.println("Inside Derived sun");
    }

    public void run()
    {
        System.out.println("Inside Derived run");
    }
}

class RMD
{
    public static void main(String A[]) {
        
        // Base bobj = new Base();   // No-Casting
        Base bobj = new Derived();      //Up casting
        // Derived dobj = new Derived();      //No casting
        Derived dobj = new Base();      //Downcasting


        


    }
}