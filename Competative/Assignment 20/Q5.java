class Q5
{
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.findSmallestNumber(83429);
    }
}

class Logic
{
    void findSmallestNumber(int iNum)
    {
        int iDigit = 0;
        int iMin = 9;

        while(iNum != 0)
        {
            iDigit = iNum % 10;
            if(iDigit < iMin)
            {
                iMin = iDigit;
            }
            iNum = iNum / 10;
        }

        System.out.println("Smallest number is : " + iMin);
    }
}