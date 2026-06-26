class Q5
{
    public static void main(String A[])
    {
        String str1 = "Marvellous Multi OS";

        String str2 = StringX.strNcpyX(str1);

        System.out.println(str2);
    }
}

class StringX
{
    public static String strNcpyX(String str1)
    {
        char Arr1[] = str1.toCharArray();
        char Arr2[] = new char[Arr1.length];

        int j = 0;

        for(int i = 0; i < Arr1.length; i++)
        {
            if(Arr1[i] >= 'a' && Arr1[i] <= 'z')
            {
                Arr2[j] = Arr1[i];
                j++;
            }
        }

        return new String(Arr2);
    }
}