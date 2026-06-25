class Q1
{
    public static void DisplayASCII()
    {
        for(int i = 0; i <= 255; i++)
        {
            System.out.printf("%d  -> %c\n", i ,i);
        }
    }
    public static void main(String A[])
    {
        DisplayASCII();
    }
}