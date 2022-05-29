// input : iRow = 4,   iCol = 4
// Output :
//      a   b   c   d   
//      a   b   c   
//      a   b   
//      a 
//      a   b
//      a   b   c
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
            for (j = 1, ch = 'a'; j <= i; j++, ch++) {
                System.out.print(ch + "\t");
            }
            System.out.println("");
        }
        for(i = 2; i <= iRow; i++)
        {
            for(j = 1, ch = 'a'; j <= i; j++, ch++)
            {
                System.out.print(ch + "\t");
            }
            System.out.println("");
        }
    }
}

class Pattern19
{
    public static void main(String arg[])
    {
        Display obj = new Display();
        obj.Print();
    }
}