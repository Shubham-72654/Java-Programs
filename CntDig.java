// Count number of Digits
// Input = 7564
// Output = 4

import Problems.NumberX;

class CountDig extends NumberX
{
    public int CountDigit()
    {
        super.Accept();
        super.Display();

        // updater
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int iDigit = 0, iDigCnt = 0;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iDigCnt++;
            iNo = iNo / 10;
        }
        return iDigCnt;
    }
}

class CntDig
{
    public static void main(String arg[])
    {
        int iRet = 0;
        CountDig obj = new CountDig();

        iRet = obj.CountDigit();
        System.out.println("Count digit of number is : " + iRet);
    }
}