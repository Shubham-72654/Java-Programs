// Check Frequency of given number in array

import Problems.ArrFreqX;
import java.util.*;

class ChkFreq extends ArrFreqX
{
    
    public ChkFreq(int iNo)
    {
        super(iNo);
    }

    public int CheckFrequency()
    {
        super.Accept(); // call accept method for accept elements and number that we want to search
        super.Display();    // for displat elements

        int iCnt = 0, iFreqCnt = 0;
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if (Arr[iCnt] == iSearch) {
                iFreqCnt++;
            }
        }
        return iFreqCnt;
    }
}

class ArrFreq
{
    public static void main(String arg[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        iValue = sobj.nextInt();

        ChkFreq cobj = new ChkFreq(iValue);

        iRet = cobj.CheckFrequency();
        System.out.println("Frequency is " + iRet);
    }
}