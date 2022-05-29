// input : iRow = 4,   iCol = 4
// Output :
//                  d     
//              c   d
//          b   c   d   
//      a   b   c   d    

import Problems.Pattern.PatternXX;

class Display extends PatternXX
{
    public void Print()
    {
        super.Accept();
        super.Display();

        int i = 0, j = 0;
        char ch = '\0';

        System.out.println("\nPattern is : ");
        for(i = iRow; i >= 1; i--)
        {
            for(j = 1, ch = 'a'; j <= iCol; j++, ch++)
            {
                if (i <= j)
                {
                    System.out.print(ch + "\t");
                }
                else
                {
                    System.out.print(" \t");
                }
            }
            System.out.println("");
        }
    }
}

class Pattern21
{
    public static void main(String arg[])
    {
        Display obj = new Display();
        obj.Print();
    }
}