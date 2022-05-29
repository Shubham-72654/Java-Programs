// Check given number is Prime number or not 
// Prime numbers = 7, 11, 13, 17, 23, 29 etc.


import Problems.NumberX;

class CheckPrime extends NumberX
{
    public int ChkPrime()
    {
        super.Accept();
        super.Display();

        // updater
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int iCnt = 0, iSum = 0;
        for(iCnt = 2; iCnt <= (iNo / 2); iCnt++)
        {
            if (iNo % iCnt == 0)
            {
                break;
            }
        }
        if(iCnt > (iNo/2))
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}

class ChkPrime
{
    public static void main(String arg[])
    {
        int iRet = 0;

        CheckPrime obj = new CheckPrime();

        iRet = obj.ChkPrime();

        if (iRet == 1)
        {
            System.out.println("It is a Prime number");
        }
        else
        {
            System.out.println("It is not a Prime number");
        }
    }
}