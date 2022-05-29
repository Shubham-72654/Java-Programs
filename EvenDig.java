// Input = 7564
// Output = 4
//          6

import Problems.NumberX;

class EvenDigit extends NumberX
{
    public void DisplayEven()
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
            if (iDigit % 2 == 0)
            {
                System.out.println(iDigit);
            }
            iNo = iNo / 10;
        }
    }
}

class EvenDig
{
    public static void main(String arg[])
    {
        EvenDigit obj = new EvenDigit();

        obj.DisplayEven();
    }
}