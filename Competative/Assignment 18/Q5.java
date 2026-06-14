class Q5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkSign(-2);
    }
}

class Logic
{
    void checkSign(int iNo)
    {
        if(iNo < 0)
        {
            System.out.println("Number is negative");
        }
        else if(iNo > 0)
        {
            System.out.println("Number is positive");
        }
        else
        {
            System.out.println("Number is zero");
        }
    }
}