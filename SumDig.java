// Sum of Digits
// Input = 7564
// Output = 7+5+6+4 = 22

import Problems.NumberX;

class SumOfDigit extends NumberX
{
    public int SumDigit()
    {
        super.Accept();
        super.Display();

        // updater
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int iDigit = 0, iSum = 0;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }
        return iSum;
    }
}

class SumDig
{
    public static void main(String arg[])
    {
        int iRet = 0;
        SumOfDigit obj = new SumOfDigit();

        iRet = obj.SumDigit();
        System.out.println("Sum of digits is : " + iRet);
    }
}