import java.util.*;


class Q1
{
    public static void main(String A[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character : ");
        char cValue = sc.next().charAt(0);

        StringX sobj = new StringX();

        boolean bRet = sobj.checkAlpha(cValue);

        if(bRet == true)
        {
            System.out.println("It is a character");
        }
        else
        {
            System.out.println("It is not a character");
        }
    }
}
class StringX
{
    public boolean checkAlpha(char ch)
    {
        if( ch >= 'A' && ch <= 'Z' ||
            ch >= 'a' && ch <= 'z'
          )
            {
                return true;
            }
            return false;
    }
}