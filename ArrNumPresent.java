// Accept N number from user and one another number and check whether number is present or not 

import Problems.ArrFreqX;
import java.util.*;

class ChkNum extends ArrFreqX
{
    public ChkNum(int X)
    {
        super(X);
    }

    public boolean CheckNumber()
    {
        super.Accept();
        super.Display();

        int iCnt = 0;
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if (Arr[iCnt] == iSearch) {
                break;
            }
        }
        if(iCnt == Arr.length)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}

class ArrNumPresent
{
    public static void main(String arg[])
    {
        int iLength = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the number of elements : ");
        iLength = sobj.nextInt();

        ChkNum obj = new ChkNum(iLength);
        bRet = obj.CheckNumber();

        if(bRet == true)
        {
            System.out.println("Number is present in Array list");
        }
        else
        {
            System.out.println("Number is not present in Array list");
        }
    }
}