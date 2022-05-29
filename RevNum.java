// Reverse Number
// Input = 7564
// Output = 4657

import java.beans.IndexedPropertyChangeEvent;

import Problems.NumberX;

class ReverseNum extends NumberX
{
    public int ReverseNumber()
    {
        super.Accept();
        super.Display();

        // updater
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int iDigit = 0, iRev = 0;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRev = iRev * 10 + iDigit;
            iNo = iNo / 10;
        }
        return iRev;
    }
}

class RevNum
{
    public static void main(String arg[])
    {
        int iRet = 0;
        ReverseNum obj = new ReverseNum();

        iRet = obj.ReverseNumber();
        System.out.println("Reverse of Number is : " + iRet);
    }
}