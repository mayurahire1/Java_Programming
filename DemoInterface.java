class DemoInterface 
{

    public static void main(String A[]) 
    {
        System.out.println(Circle.PI);

        Circle.PI = 7.12f;      // Error due to final
    }
}

interface Circle 
{
    // Characterstics
    float PI = 3.14f;       // public static final

}

