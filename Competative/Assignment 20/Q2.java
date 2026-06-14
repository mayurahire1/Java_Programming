class Q2    
{
    public static void main(String A[])
    {   
        Logic obj = new Logic();
        obj.printReverse(10);
    }
}

class Logic
{
    void printReverse(int n)
    {
        int iCnt = 0;
        
        for(iCnt = n; iCnt > 0; iCnt--)
        {
            System.out.println(iCnt);
        }

    }
} 