// Sum of Even Digits
// Input = 7564
// Output = 10

import Problems.NumberX;

class SumOfEven extends NumberX
{
    public int SumEven()
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
            if (iDigit % 2 == 0) {
                iSum = iSum + iDigit;
            }
            iNo = iNo / 10;
        }
        return iSum;
    }
}

class SumEvenDig
{
    public static void main(String arg[])
    {
        int iRet = 0;
        SumOfEven obj = new SumOfEven();

        iRet = obj.SumEven();
        System.out.println("Summation of even digits is : " + iRet);
    }
}