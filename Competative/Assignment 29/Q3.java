
import java.util.*;

class Q3 {

    public static void main(String A[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character : ");
        char cValue = sc.next().charAt(0);

        StringX sobj = new StringX();

        boolean bRet = sobj.checkDigit(cValue);

        if (bRet == true) {
            System.out.println("It is a digit");
        } else {
            System.out.println("It is not a digit");
        }
    }
}

class StringX {

    public boolean checkDigit(char ch) {
        if (ch >= '0' && ch <= '9') {
            return true;
        }
        return false;
    }
}
