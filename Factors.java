// Display Factors of Given Number
// Input = 10
// Output = 1,2,5

import Problems.NumberX;

class DisplayFactors extends NumberX
{
    public void Factors()
    {
        super.Accept();
        super.Display();

        // Updater
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        
        int iCnt = 0;
        for (iCnt = 1; iCnt <= (iNo / 2); iCnt++)
        {
            if (iNo % iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class Factors
{
    public static void main(String arg[])
    {
        DisplayFactors obj = new DisplayFactors();
        obj.Factors();
    }
}