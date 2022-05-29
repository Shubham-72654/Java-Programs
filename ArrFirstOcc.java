// Accept N number and one another number search that number and return its first occurance index

import Problems.ArrFreqX;
import java.util.*;

class ChkOccur extends ArrFreqX
{
    public ChkOccur(int X)
    {
        super(X);
    }

    public int checkFirstOcc()
    {
        super.Accept();
        super.Display();

        int iCnt = 0;
        for (iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == iSearch)
            {
                break;
            }
        }
        if(iCnt == Arr.length)
        {
            return -1;
        }
        else
        {
            return iCnt;
        }
    }
}

class ArrFirstOcc
{
    public static void main(String arg[])
    {
        int iLength = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        iLength = sobj.nextInt();

        ChkOccur obj = new ChkOccur(iLength);

        iRet = obj.checkFirstOcc();
        if (iRet == -1)
        {
            System.out.println("Element is not present in Array list that you want to search");
        }
        else
        {
            System.out.println("First occurance index of element is : " + iRet);
        }
    }
}