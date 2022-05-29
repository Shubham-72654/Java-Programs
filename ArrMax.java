// Accept N number from user and find largest

import Problems.ArrayX;
import java.util.*;

class Maximum extends ArrayX
{
    public Maximum(int X)
    {
        super(X);
    }

    public int Max()
    {
        super.Accept();
        super.Display();

        int iCnt = 0, iMax = Arr[0];

        for (iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] > iMax)
            {
                iMax = Arr[iCnt];
            }
        }
        return iMax;
    }
}

class ArrMax
{
    public static void main(String arg[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements");
        iValue = sobj.nextInt();

        Maximum mobj = new Maximum(iValue);
        iRet = mobj.Max();
        System.out.println("Largest member from array is : " + iRet);
    }
}