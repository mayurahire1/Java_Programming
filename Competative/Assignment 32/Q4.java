import java.util.*;

class Q4
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        StringX strobj = new StringX();

        strobj.DisplayDigits(str);

    }
}

class StringX
{
    public void DisplayDigits(String str)
    {
        char Arr[] = str.toCharArray();
        int i = 0;

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= '0' && Arr[i] <= '9')
            {
                System.out.print(Arr[i]);
            }
            
        }
        
    }
}
