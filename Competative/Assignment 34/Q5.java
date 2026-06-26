class Q5
{
    public static void main(String A[])
    {
        String str1 = "Marvellous Infosystem";
        String str2 = " Logic Building";

        String str3 = StringX.strCatX(str1, str2);

        System.out.println(str3);
    }
}

class StringX
{
    public static String strCatX(String str1, String str2)
    {
        char Arr1[] = str1.toCharArray();
        char Arr2[] = str2.toCharArray();

        char Arr3[] = new char[Arr1.length + Arr2.length];

        int i = 0;
        int j = 0;

        while(i < Arr1.length)
        {
            Arr3[i] = Arr1[i];
            i++;
        }

        while(j < Arr2.length)
        {
            Arr3[i] = Arr2[j];
            i++;
            j++;
        }

        return new String(Arr3);
    }
}