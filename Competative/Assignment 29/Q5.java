import java.util.*;

class Q5
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the division: ");
        char div = sc.next().charAt(0);

        Student.DisplaySchedule(div);
    }
}


class Student
{
    public static void DisplaySchedule(char chDiv)
    {
         if (chDiv == 'A' || chDiv == 'a')
        {
            System.out.println("Your exam at 7:00 AM\n");
        }
        else if (chDiv == 'B' || chDiv == 'b')
        {
            System.out.println("Your exam at 8:30 AM\n");
        }
        else if (chDiv == 'C' || chDiv == 'c')
        {
            System.out.println("Your exam at 9:20 AM\n");
        }
        else if (chDiv == 'D' || chDiv == 'd')
        {
            System.out.println("Your exam at 10:30 AM\n");
        }
    }
}