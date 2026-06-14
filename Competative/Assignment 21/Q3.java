class Q3
{
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.displayFactors(12);
    }
}

class Logic
{
    void displayFactors(int iNum)
    {
        int iCnt = 0;
        
        for(iCnt = 1; iCnt <= (iNum / 2); iCnt++)
        {
            if(iNum % iCnt == 0)
            {
                System.out.print(iCnt + "\t");

            }
        }

        
    }
}