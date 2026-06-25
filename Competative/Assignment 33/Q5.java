import java.util.*;

class Q5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        String sRet = null;

        System.out.println("Enter the string : ");
        str = sobj.nextLine();

        StringX strobj = new StringX();
        sRet = strobj.strrevX(str);

        System.out.println(sRet);
        
    }
}

class StringX
{
    public String strrevX(String str)
    {
        int start = 0, end = 0;

        char temp;

        char Arr[] = str.toCharArray();

        start = 0;
        end = Arr.length - 1;

        while(start < end)
        {
            temp = Arr[start];
            Arr[start] = Arr[end];
            Arr[end] = temp;

            start++;
            end--;
        }
        
        return new String(Arr);
    }
}