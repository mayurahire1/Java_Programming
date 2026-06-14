class Q1
{
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.productOfDigits(83429);
    }
}

class Logic
{
    void productOfDigits(int iNum)
    {
        int iDigit = 0;
        int iProduct = 1;

        while(iNum != 0)
        {
            iDigit = iNum % 10;
            iProduct = iProduct * iDigit;
            iNum = iNum / 10;
        }

        System.out.println("Products of digits is : " + iProduct);
    }
}