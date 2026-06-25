import java.util.*;

class Q1
{
    public static void main(String A[])
    {
        String str1 = "Marvellous Multi OS";

        String newStr = StringX.strCpyX(str1);

        System.out.println("Copied String : " + newStr);
    }
}

class StringX
{
    public static String strCpyX(String str1)
    {
        char Arr1[] = str1.toCharArray();
        char Arr2[] = new char[Arr1.length];

        for(int i = 0; i < Arr1.length; i++)
        {
            Arr2[i] = Arr1[i];
        }

        return new String(Arr2);
    }
}