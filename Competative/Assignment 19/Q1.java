class Q1
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkLeapYear(2024);
    }
}

class Logic
{
    void checkLeapYear(int year)
    {
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            System.out.println("Year is leap");
        }
        else
        {
            System.out.println("Year is not leap");
        }
    }
}