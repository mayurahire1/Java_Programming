import java.util.*;

class Q4
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
        iRet = strobj.lastChar(str, ch);

        System.out.println("Charcter first occurence : " + iRet);
        
    }
}

class StringX
{
    public int lastChar(String str, char ch)
    {
        int i=0;
        int idx = 0;
        boolean bFLag = false;

        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ch)
            {
                idx = i;
                bFLag = true;
            }
        }

        if(bFLag)
        {
            return idx;
        }
        else
        {
            return -1;
        }
        
    }
}