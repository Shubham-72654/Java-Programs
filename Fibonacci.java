// Input : 8
// Output : 1   1   2   3   5   8   13  21  34

import Problems.NumberX;

class DisplayFibbo extends NumberX
{
    public void Fibbo()
    {
        super.Accept();
        super.Display();

        int iCnt = 0, a = 0, b = 1, c = 0;
        
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            c = a + b;
            System.out.print(c + "\t");
            b = a;
            a = c;
        }
    }
}

class Fibonacci
{
    public static void main(String arg[])
    {
        DisplayFibbo obj = new DisplayFibbo();
        obj.Fibbo();
    }
}