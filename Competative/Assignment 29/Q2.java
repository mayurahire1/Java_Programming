import java.util.*;


class Q2
{
    public static void main(String A[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character : ");
        char cValue = sc.next().charAt(0);

        StringX sobj = new StringX();

        boolean bRet = sobj.checkCapital(cValue);

        if(bRet == true)
        {
            System.out.println("It is a capital character");
        }
        else
        {
            System.out.println("It is not a capital character");
        }
    }
}
class StringX
{
    public boolean checkCapital(char ch)
    {
        if( ch >= 'A' && ch <= 'Z')
            {
                return true;
            }
            return false;
    }
}