// input : 5
// Output : A   B   C   D   E

import Problems.Pattern.PatternX;

class Display extends PatternX
{
    public void Print()
    {
        super.Accept();
        super.Display();

        int iCnt = 0;
        char ch = '\0';

        System.out.println("\nPattern is : ");
        for(iCnt = 1, ch = 'A'; iCnt <= iNo; iCnt++, ch++)
        {
            System.out.print(ch+"\t");
        }
    }
}

class Pattern3
{
    public static void main(String arg[])
    {
        Display obj = new Display();
        obj.Print();
    }
}