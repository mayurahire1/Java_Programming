import java.util.*;

class Q2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str1 = sobj.nextLine();

        System.out.print("Enter number of characters to copy : ");
        int iNo = sobj.nextInt();

        String newStr = StringX.strNCpyX(str1, iNo);

        System.out.println("Copied String : " + newStr);
    }
}

class StringX
{
    public static String strNCpyX(String str1, int iNo)
    {
        char Arr1[] = str1.toCharArray();

        if(iNo > Arr1.length)
        {
            iNo = Arr1.length;
        }

        char Arr2[] = new char[iNo];

        for(int i = 0; i < iNo; i++)
        {
            Arr2[i] = Arr1[i];
        }

        return new String(Arr2);
    }
}