// Input = 7564
// Output = 4
//          6
//          5
//          7


import Problems.NumberX;

class ReverseDig extends NumberX
{
    public void RevDigit()
    {
        super.Accept();
        super.Display();

        // updater
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int iDigit = 0;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;
        }
    }
}

class RevDig
{
    public static void main(String arg[])
    {
        ReverseDig obj = new ReverseDig();

        obj.RevDigit();
    }
}