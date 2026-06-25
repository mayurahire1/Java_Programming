import java.util.*;

class Q5
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        StringX strobj = new StringX();

        int iRet = strobj.DisplayDigits(str);

        System.out.println("The number of white spaces: " + iRet);
    }   
}

class StringX
{
    public int DisplayDigits(String str)
    {
        char Arr[] = str.toCharArray();
        int i = 0;
        int iCount = 0;

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ' ')
            {
                iCount++;
            }
        }
        return iCount;
    }
}
