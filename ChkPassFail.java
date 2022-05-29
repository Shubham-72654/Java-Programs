import Problems.NumberX;

class Grade extends NumberX
{
    public void CheckDiv()
    {
        super.Accept();
        super.Display();

        int iMarks = iNo;

        if ((iMarks >= 0) && (iMarks <= 33)) {
            System.out.println("Fail");
        } else if ((iMarks > 33) && (iMarks <= 50)) {
            System.out.println("C Grade");
        } else if ((iMarks > 50) && (iMarks <= 60)) {
            System.out.println("B Grade");
        } else if ((iMarks > 60) && (iMarks <= 74)) {
            System.out.println("A Grade");
        } else if ((iMarks > 74) && (iMarks <= 100)) {
            System.out.println("A+ Grade");
        } else {
            System.out.println("Enter Valid Marks");
        }
    }

}

class ChkPassFail
{
    public static void main(String arg[])
    {
        Grade obj = new Grade();
        obj.CheckDiv();
    }
}