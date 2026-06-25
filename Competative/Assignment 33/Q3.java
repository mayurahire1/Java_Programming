import java.util.*;

class Q3
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
        iRet = strobj.FirstChar(str, ch);

        System.out.println("Charcter first occurence : " + iRet);
        
    }
}

class StringX
{
    public int FirstChar(String str, char ch)
    {
        int i=0;
        boolean bFLag = false;

        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ch)
            {
                bFLag = true;
                break;
            }
        }

        if(bFLag)
        {
            return i;
        }
        else
        {
            return -1;
        }
        
    }
}