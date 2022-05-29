// Given number is palindrome or not
// Input = 75657
// Output = Palindrome

import Problems.NumberX;

class CheckPalindrome extends NumberX
{
    public int Palindrome()
    {
        super.Accept();
        super.Display();

        // updater
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int iDigit = 0, iRev = 0, iTemp = 0;
        iTemp = iNo;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRev = iRev * 10 + iDigit;
            iNo = iNo / 10;
        }

        if (iTemp == iRev)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}

class ChkPalindrome
{
    public static void main(String arg[])
    {
        int iRet = 0;
        CheckPalindrome obj = new CheckPalindrome();

        iRet = obj.Palindrome();

        if (iRet == 1)
        {
            System.out.println("Number is  Palindrome");
        }
        else
        {
            System.out.println("Number is not Palindrome");
        }
    }
}