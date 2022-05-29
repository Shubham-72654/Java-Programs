// Accept N number and one another number search that number and return its last occurance index

import Problems.ArrFreqX;
import java.util.*;

class ChkLastOccur extends ArrFreqX
{
    public ChkLastOccur(int X)
    {
        super(X);
    }

    public int checkLastOcc()
    {
        super.Accept();
        super.Display();

        int iCnt = 0;
        for (iCnt = (Arr.length - 1); iCnt >= 0; iCnt--)
        {
            if(Arr[iCnt] == iSearch)
            {
                break;
            }
        }
        return iCnt;
    }
}

class ArrLastOcc
{
    public static void main(String arg[])
    {
        int iLength = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        iLength = sobj.nextInt();

        ChkLastOccur obj = new ChkLastOccur(iLength);

        iRet = obj.checkLastOcc();
        if (iRet == -1)
        {
            System.out.println("Element is not present in Array list that you want to search");
        }
        else
        {
            System.out.println("Last occurance index of element is : " + iRet);
        }
    }
}