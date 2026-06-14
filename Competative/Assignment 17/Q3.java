
class Q3
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.findMax(20, 15);
    }
}

class Logic
{
    public void findMax(int iNo1, int iNo2)
    {
        if(iNo1 > iNo2)
        {
            System.out.println(iNo1 + " is Max");
        }
        else
        { 
            System.out.println(iNo2 + " is Max");
        }
    }
}
