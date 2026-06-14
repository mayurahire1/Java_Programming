class Q1
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkPrime(11);
    }
}

class Logic
{
    void checkPrime(int iNo)
    {
        int iCnt = 0;
        boolean bFlag = false;

        for(iCnt = 0; iCnt < (iNo / 2); iCnt++)
        {
            if(iNo % 2 == 0)
            {
                bFlag = true;
            }
        }

        if(bFlag)
        {
            System.out.println("It is Prime Number");
        }else{
            System.out.println("It is not Prime Number");

        }
    }
}