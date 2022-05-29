// input : 5
// Output : 5 4 3 2 1

import Problems.Pattern.PatternX;

class Display extends PatternX
{
    public void Print()
    {
        super.Accept();
        super.Display();

        int iCnt = 0;

        System.out.println("\nPattern is : ");
        for(iCnt = iNo; iCnt > 0; iCnt--)
        {
            System.out.print(iCnt + "\t");
        }
    }
}

class Pattern1
{
    public static void main(String arg[])
    {
        Display obj = new Display();
        obj.Print();
    }
}