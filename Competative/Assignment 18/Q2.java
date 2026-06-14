class Q2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printEvenNumbers(20);
    }
}

class Logic
{
    void printEvenNumbers(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 2; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}