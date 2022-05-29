// Accept N number from user and find largest

import Problems.ArrayX;
import java.util.*;

class Minimum extends ArrayX
{
    public Minimum(int X)
    {
        super(X);
    }

    public int Min()
    {
        super.Accept();
        super.Display();

        int iCnt = 0, iMin = Arr[0];

        for (iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] < iMin)
            {
                iMin = Arr[iCnt];
            }
        }
        return iMin;
    }
}

class ArrMin
{
    public static void main(String arg[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements");
        iValue = sobj.nextInt();

        Minimum mobj = new Minimum(iValue);
        iRet = mobj.Min();
        System.out.println("Smallest member from array is : " + iRet);
    }
}