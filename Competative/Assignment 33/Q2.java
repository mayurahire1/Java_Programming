import java.util.*;

class Q2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        char ch; 
        int iRet = 0;

        System.out.println("Enter the string : ");
        str = sobj.nextLine();

        System.out.println("Enter the character to be search:");
        ch = sobj.next().charAt(0);

        StringX strobj = new StringX();
        iRet = strobj.countChar(str, ch);

        System.out.println("Charcter frequency : " + iRet);
        
    }
}

class StringX
{
    public int countChar(String str, char ch)
    {
        int i=0;
        int iCount =0;

        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ch)
            {
                iCount++;
            }
        }
        return iCount;
    }
}