import java.util.*;

class Q3
{
    public static void Display(char ch)
    {
        int i = 0;

        if(ch >= 'A' && ch <= 'Z')
        {
            for(i = ch; i <= 'Z'; i++)
            {
                System.out.print((char)i + " ");
            }    
        }
        else if(ch >= 'a' && ch <= 'z')
        {
            for(i = ch; i >= 'a'; i--)
            {
                System.out.print((char)i + " ");
            } 
        }
        else
        {
            return;
        }
    }
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enterr a character : ");
        char ch = sc.next().charAt(0);

        Display(ch);
    }
}