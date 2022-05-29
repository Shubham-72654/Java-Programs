// Summation of Given number
// Input = 6
// Output = 21  (6+5+4+3+2+1)


import Problems.NumberX;

class Sum extends NumberX
{
    public int Summation()
    {
        super.Accept();
        super.Display();

        // updater
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int iCnt = 0, iSum = 0;
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iSum = iSum + iCnt;
        }
        return iSum;
    }
}

class SumNum
{
    public static void main(String arg[])
    {
        int iRet = 0;

        Sum obj = new Sum();

        iRet = obj.Summation();
        System.out.println("Summation is : " + iRet);

    }
}