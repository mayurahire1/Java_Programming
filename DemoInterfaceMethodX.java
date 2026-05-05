class DemoInterfaceMethodX
{

    public static void main(String A[]) 
    {
        // Circle cobj = new Circle();      -> Not Allowed
        Marvellous mobj = new Marvellous();
 
        float Ret = 0.0f;

        Ret = mobj.Area(10.5f);
        System.out.println("Area is : "+Ret);
        
        Ret = mobj.Circumfarance(10.5f);
        System.out.println("Circumeference is : "+Ret);
    }
}

interface Circle 
{
    // Characterstics (public static final)
    float PI = 3.14f;       

    // Behaviors (public abstract)
    float Area(float Radius);

    float Circumfarance(float Radius);

}

class Marvellous implements Circle
{
    public float Area(float Radius)
    {
        return Circle.PI * Radius * Radius;
    }

    public float Circumfarance(float Radius)
    {
        return 2 * Circle.PI * Radius;
    }
}   
