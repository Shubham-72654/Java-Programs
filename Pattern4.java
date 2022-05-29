// input : 8
// Output : A   b   C   d   E   f   G   h

import Problems.Pattern.PatternX;

class Display extends PatternX
{
    public void Print()
    {
        super.Accept();
        super.Display();

        int iCnt = 0;
        char ch = '\0', sh = '\0';

        System.out.println("\nPattern is : ");
        for(iCnt = 1, ch = 'A', sh = 'a'; iCnt <= iNo; iCnt++, ch++, sh++)
        {
            if (iCnt % 2 == 0)
            {
                System.out.print(sh + "\t");
            }
            else
            {
                System.out.print(ch + "\t");
            }

        }
    }
}

class Pattern4
{
    public static void main(String arg[])
    {
        Display obj = new Display();
        obj.Print();
    }
}