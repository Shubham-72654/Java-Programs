// input : 5
// Output : -5  -4  -3  -2  -1   0   1   2   3   4   5  

import Problems.Pattern.PatternX;

class Display extends PatternX
{
    public void Print()
    {
        super.Accept();
        super.Display();

        int iCnt = 0;

        System.out.println("\nPattern is : ");
        for(iCnt = -iNo; iCnt <= iNo; iCnt++)
        {
            System.out.print(iCnt + "\t");  // -5  -4  -3  -2  -1  0   1  2  3  4  5
        }
    }
}

class Pattern6
{
    public static void main(String arg[])
    {
        Display obj = new Display();
        obj.Print();
    }
}