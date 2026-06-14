class Q5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printTable(5);
    }       
}
class Logic
{
    public void printTable(int iNum)
    {
        for (int i = 1; i <= 10; i++) {
            System.out.println(iNum + " x " + i + " = " + iNum * i);  
        }
    }
}