class Q4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(123456);
    }
}

class Logic
{
    void sumEvenOddDigits(int iNo)
    {
        int iDigit = 0;
        int iSumEven = 0;
        int iSumOdd = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            
            if(iDigit % 2 == 0)
            {
                iSumEven = iSumEven + iDigit;
            }
            else
            {
                iSumOdd = iSumOdd + iDigit;
            }

            iNo = iNo / 10;
        }

        System.out.println("The sum of Even numbers: " + iSumEven);
        System.out.println("The sum of Odd numbers: " + iSumOdd);
    }
}