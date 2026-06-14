class Q4
{
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);
    }
}

class Logic
{
    void findLargestDigit(int iNum)
    {
        int iDigit = 0;
        int iMax = 0;

        while(iNum != 0)
        {
            iDigit = iNum % 10;
            if(iDigit > iMax)
            {
                iMax = iDigit;
            }
            iNum = iNum / 10;
        }

        System.out.println("Largest number is : " + iMax);
    }
}