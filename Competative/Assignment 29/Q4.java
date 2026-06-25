import java.util.*;


class Q4
{
    public static void main(String A[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character : ");
        char cValue = sc.next().charAt(0);

        StringX sobj = new StringX();

        boolean bRet = sobj.checkSmall(cValue);

        if(bRet == true)
        {
            System.out.println("It is a small character");
        }
        else
        {
            System.out.println("It is not a small character");
        }
    }
}
class StringX
{
    public boolean checkSmall(char ch)
    {
        if( ch >= 'a' && ch <= 'z')
            {
                return true;
            }
            return false;
    }
}