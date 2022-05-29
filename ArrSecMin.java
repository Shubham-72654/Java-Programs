// Accept N number from user and find second smallest

import Problems.ArrayX;
import java.util.*;

class SecondMinimum extends ArrayX
{
    public SecondMinimum(int X)
    {
        super(X);
    }

    public int SecMin()
    {
        super.Accept();
        super.Display();

        int iCnt = 0, j = 0, iMin = Arr[0], iMin2 = Arr[0];

        for (iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if (Arr[iCnt] < iMin) {
                iMin = Arr[iCnt];
            }
        }
        //System.out.println("Min number is : " + iMin);
        
        for (j = 0; j < Arr.length; j++)
        {
            if ((Arr[j] < iMin2) && (Arr[j] > iMin)) {
                iMin2 = Arr[j];
            }
        }
        return iMin2;
    }
}

class ArrSecMin
{
    public static void main(String arg[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements");
        iValue = sobj.nextInt();

        SecondMinimum obj = new SecondMinimum(iValue);
        iRet = obj.SecMin();
        System.out.println("Second Smallest member from array is : " + iRet);
    }
}