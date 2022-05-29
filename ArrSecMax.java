// Accept N number from user and find second largest

import Problems.ArrayX;
import java.util.*;

class SecondMaximum extends ArrayX
{
    public SecondMaximum(int X)
    {
        super(X);
    }

    public int SecMax()
    {
        super.Accept();
        super.Display();

        int iCnt = 0, iMax = 0, iMax2 = 0;

        for (iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if (Arr[iCnt] > iMax) {
                iMax = Arr[iCnt];
            }
        }
        for (int j = 0; j < Arr.length; j++)
        {
            if ((Arr[j] > iMax2) && (Arr[j] < iMax)) {
                iMax2 = Arr[j];
            }
        }
        return iMax2;
    }
}

class ArrSecMax
{
    public static void main(String arg[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements");
        iValue = sobj.nextInt();

        SecondMaximum obj = new SecondMaximum(iValue);
        iRet = obj.SecMax();
        System.out.println("Second Largest member from array is : " + iRet);
    }
}