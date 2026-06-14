class Q3
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkPerfect(6);
    }
}

class Logic
{
    void checkPerfect(int iNum)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= (iNum / 2); iCnt++)
        {
            if(iNum % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        if(iNum == iSum)
        {
            System.out.println("Number is Perfect");
        }
        else
        {
            System.out.println("Number is not Perfect");
        }
    }
}