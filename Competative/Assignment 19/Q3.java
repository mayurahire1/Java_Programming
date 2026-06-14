class Q3
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkDivisible(55);
    }
}

class Logic
{
    void checkDivisible(int iNum)
    {
        if((iNum % 5 == 0) && (iNum % 11 == 0))
        {
            System.out.println("Number is divisible by 5 and 11");
        }
        else
        {
            System.out.println("Number is not divisible by 5 and 11");
        }
    }
}