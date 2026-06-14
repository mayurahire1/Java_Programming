class Q2
{
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.countEvenOddRange(50);
    }
}

class Logic
{
    void countEvenOddRange(int iNum)
    {
        int iCnt = 0;
        int iEvenCount = 0;
        int iOddCount = 0;
        
        for(iCnt = 1; iCnt <= iNum; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iEvenCount++;
            }
            else
            {
                iOddCount++;
            }
        }

        System.out.println("Even Count : " + iEvenCount);
        System.out.println("Odd Count : " + iOddCount);

    }
}