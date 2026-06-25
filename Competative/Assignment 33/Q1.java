import java.util.*;

class Q1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        char ch; 
        boolean bRet = false;

        System.out.println("Enter the string : ");
        str = sobj.nextLine();

        System.out.println("Enter the character to be search:");
        ch = sobj.next().charAt(0);

        StringX strobj = new StringX();
        bRet = strobj.checkChar(str, ch);

        if(bRet == true)
        {
            System.out.println("Character Present");
        }
        else
        {
            System.out.println("Character not Present");
        }
    }
}

class StringX
{
    public boolean checkChar(String str, char ch)
    {
        int i=0;
        boolean bFlag = false;

        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ch)
            {
                bFlag = true;
                break;
            }
        }
        return bFlag;
    }
}