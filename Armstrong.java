// Check whether number is armstrong or not
// Armstrong number = 153 => 1^3 + 5^3 + 3^3 = 153
// 370 => 3^3 + 7^3 + 0^3 = 370
// 1634 => 1^4 + 6^4 + 3^4 + 4^4 = 1634

import Problems.NumberX;

class ChkArmstrong extends NumberX
{
    public int CheckArmStrong()
    {
        super.Accept();
        super.Display();

        int iDigit = 0, iDigCnt = 0, iTemp = 0, iCnt = 0, iMult = 0, iSum = 0;
        iTemp = iNo;
        while(iNo != 0)
        {
            iDigCnt++;
            iNo = iNo / 10;
        }
        //System.out.println(iDigCnt);
        iNo = iTemp;
        while (iNo != 0)
        {
            iDigit = iNo % 10;
            iMult = 1;

            for (iCnt = 1; iCnt <= iDigCnt; iCnt++) 
            {
                iMult = iMult * iDigit;
            }
            iSum = iSum + iMult;
            iNo = iNo / 10;
        }
        //System.out.println(iSum);
        if (iTemp == iSum)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}

class Armstrong
{
    public static void main(String arg[])
    {
        int iRet = 0;

        ChkArmstrong obj = new ChkArmstrong();

        iRet = obj.CheckArmStrong();
        
        if(iRet == 1)
        {
            System.out.println("It is a Armstrong number");
        }
        else
        {
            System.out.println("It is not a Armstrong number");
        }
    }
}