// input : iRow = 4,   iCol = 4
// Output :
//      a   b   c   d   
//      a   b   c   d
//      a   b   c   d
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
        for(i = 1; i <= iRow; i++)
        {
            for(j = 1, ch = 'a'; j <= iCol; j++, ch++)
            {
                System.out.print(ch +"\t");
            }
            System.out.println("");
        }
    }
}

class Pattern17
{
    public static void main(String arg[])
    {
        Display obj = new Display();
        obj.Print();
    }
}