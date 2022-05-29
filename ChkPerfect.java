// Check given number is perfect or not (Number = Addition of its factors)
// Input = 6
// Output = 1 + 2 + 3 = 6  (it is perfect)


import Problems.NumberX;

class CheckPerfect extends NumberX
{
    public int ChkPerfect()
    {
        super.Accept();
        super.Display();

        // updater
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int iCnt = 0, iSum = 0;
        for(iCnt = 1; ((iCnt <= (iNo / 2)) && (iSum <= iNo)); iCnt++)
        {
            if (iNo % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        if(iNo == iSum)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}

class ChkPerfect
{
    public static void main(String arg[])
    {
        int iRet = 0;

        CheckPerfect obj = new CheckPerfect();

        iRet = obj.ChkPerfect();

        if (iRet == 1)
        {
            System.out.println("It is a Perfect number");
        }
        else
        {
            System.out.println("It is not a Perfect number");
        }
    }
}