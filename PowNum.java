// Power of numbers
// Input = 2    4
// Output = 2*2*2*2 = 16

import Problems.PowerX;

class PowerOfNum extends PowerX
{
    public int Power()
    {
        super.Accept();
        super.Display();

        int iCnt = 0, iPow = 1;

        for(iCnt = 1; iCnt <= iNo2; iCnt++)
        {
            iPow = iPow * iNo1;
        }
        return iPow;
    }
}

class PowNum
{
    public static void main(String arg[])
    {
        int iRet = 0;
        PowerOfNum obj = new PowerOfNum();

        iRet = obj.Power();

        System.out.println("After power is : "+iRet);
    }
}