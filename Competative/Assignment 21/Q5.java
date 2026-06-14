class Q5
{
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.printDivisibleBy2and3(30);
    }
}

class Logic
{
    void printDivisibleBy2and3(int iNum)
    {
        int iCnt = 0;
        
        for(iCnt = 1; iCnt <= iNum; iCnt++)
        {
            if((iCnt % 2 == 0) && (iCnt % 3 == 0))
            {
                 System.out.println(iCnt);
            }
        }

    }
}