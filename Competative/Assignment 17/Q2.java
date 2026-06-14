

class Q2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkPalindrome(121);
    }
}

class Logic
{
    void checkPalindrome(int num)
    {
        int iDigit = 0;
        int iRev = 0;
        int iTemp = 0;

        iTemp = num;

        while(iTemp != 0)
        {
            iDigit = iTemp % 10;
            iRev = (iRev * 10) + iDigit;
            iTemp = iTemp / 10;
        }

        if(num == iRev)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
        }
    }
}