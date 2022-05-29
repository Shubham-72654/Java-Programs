// input : iRow = 4,   iCol = 4
// Output :
//   *   *   *   *
//   *   *   *   *
//   *   *   *   *
//   *   *   *   *

import Problems.Pattern.PatternXX;

class Display extends PatternXX
{
    public void Print()
    {
        super.Accept();
        super.Display();

        int i = 0, j = 0;

        System.out.println("\nPattern is : ");
        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print("*\t");
            }
            System.out.println("");
        }
    }
}

class Pattern7
{
    public static void main(String arg[])
    {
        Display obj = new Display();
        obj.Print();
    }
}