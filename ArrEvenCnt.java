// Display even elements from array

import Problems.ArrayX;
import java.util.*;

class EvenCount extends ArrayX
{
    public EvenCount(int X)
    {
        super(X);
    }

    public int DisplayEvenCount()
    {
        super.Accept();
        super.Display();

        int iCnt = 0, iEvenCnt = 0;
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if (Arr[iCnt] % 2 == 0) {
                iEvenCnt++;
            }
        }
        return iEvenCnt;
    }
}

class ArrEvenCnt
{
    public static void main(String arg[])
    {
        int iValue = 0, iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements :");
        iValue = sobj.nextInt();

        EvenCount dobj = new EvenCount(iValue);

        iRet = dobj.DisplayEvenCount();
        System.out.println("Number of Even elements are : " + iRet);
    }
}