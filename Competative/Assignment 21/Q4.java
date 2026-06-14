class Q3
{
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.countFactors(12);
    }
}

class Logic
{
    void countFactors(int iNum)
    {
        int iCnt = 0;
        int iCount = 0;
        
        for(iCnt = 1; iCnt <= (iNum / 2); iCnt++)
        {
            if(iNum % iCnt == 0)
            {
                iCount++;
            }
        }

        System.out.println("Number of factors are : " + iCount);
    }
}