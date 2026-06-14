

class Q2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.displayGrade(82);
    }
}

class Logic
{
    void displayGrade(int marks)
    {
        String cGrade = null;

        if(marks > 90)
        {
            cGrade = "O";
        }
        else if(marks > 75 && marks <= 90)
        {
            cGrade = "A";
        }  
        else if(marks > 60 && marks <= 75)
        {
            cGrade = "B";
        }    
        else if(marks > 50 && marks <= 60)
        {
            cGrade = "C";
        }  
        else if(marks > 35 && marks <= 50)
        {
            cGrade = "D";
        }  
        else
        {
            cGrade = "F";
        }

        System.out.println("Grade : " + cGrade);
    }
}