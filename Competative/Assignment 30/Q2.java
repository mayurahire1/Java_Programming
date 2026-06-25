import java.util.*;

class Q2
{
    public static void Display(char ch)
    {
        if(ch >= 'A' && ch <= 'Z')
        {
            System.out.println((char)(ch + 32));
        }
        else if(ch >= 'a' && ch <= 'z')
        {
            System.out.println((char)(ch - 32));
        }
        else
        {
            System.out.println(ch);
        }
    }
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a character : ");
        char ch = sc.next().charAt(0);

        Display(ch);
    }
}