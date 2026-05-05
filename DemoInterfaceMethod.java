class DemoInterfaceMethod
{

    public static void main(String A[]) 
    {
        Marvellous mobj = new Marvellous();
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
    // Error due to missing body of Area nad Circumefarence
}   
