// input : 5
// Output : 1   2   3   4   5   4   3   2   1

import Problems.Pattern.PatternX;

class Display extends PatternX
{
    public void Print()
    {
        super.Accept();
        super.Display();

        int iCnt = 0;

        System.out.println("\nPattern is : ");
        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            System.out.print(iCnt + "\t");  // 1    2   3   4
        }
        for(iCnt = iNo; iCnt > 0; iCnt--)
        {
            System.out.print(iCnt + "\t");  //  5   4   3   2   1
        }
    }
}

class Pattern5
{
    public static void main(String arg[])
    {
        Display obj = new Display();
        obj.Print();
    }
}