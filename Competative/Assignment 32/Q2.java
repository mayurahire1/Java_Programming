import java.util.*;

class Q2
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        StringX strobj = new StringX();

        String newStr = strobj.toUpperX(str);

        System.out.println(newStr);
    }
}

class StringX
{
    public String toUpperX(String str)
    {
        char Arr[] = str.toCharArray();
        int i = 0;

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                Arr[i] = (char)(Arr[i] - 32);
            }
        }
        return new String(Arr);
    }
}
