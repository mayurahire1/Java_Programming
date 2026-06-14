

class Q1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.sumOfDigits(1234);
    }
}

class Logic
{
    void sumOfDigits(int num)
    {
        int iDigit = 0;
        int iSum = 0;

        while(num != 0)
        {
            iDigit = num % 10;
            iSum = iSum + iDigit;
            num = num / 10;
        }

        System.out.println("Sum of Digits : " + iSum);
    }
}
