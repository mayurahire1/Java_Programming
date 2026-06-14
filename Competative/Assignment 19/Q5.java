class Q5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.calculatePower(2, 3);
    }
}

class Logic
{
    void calculatePower(int base, int exp)
    {
        int iCnt = 0;
        int iPower = 1;

        for(iCnt = 1; iCnt <= exp; iCnt++)
        {
            iPower = iPower * base;
        }
        System.out.println("Power : " + iPower);
    }
}