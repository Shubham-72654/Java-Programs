// Calculate Factorial of Given Number
// Input = 5
// Output = 120

import java.lang.*;

import Problems.NumberX;

class Fact extends NumberX
{
    public int FindFactorial()
    {
        super.Accept(); // call the Accept method from Number class by using super keyword
        
        super.Display(); // call the Display method from Number class by using super keyword
        
        // Updater
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int iCnt = 0, iFact = 1;
        
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            // iFact = iFact * iCnt;
            iFact *= iCnt;
        }
        return iFact;
    }
}

class Factorial
{
    public static void main(String arg[])
    {
        int iRet = 0;

        Fact fobj = new Fact();
        iRet = fobj.FindFactorial();
        System.out.println("Factorial of is " + iRet);
    }
}