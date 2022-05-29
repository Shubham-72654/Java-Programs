// Display even elements from array

import Problems.ArrayX;
import java.util.*;

class DisplayEven extends ArrayX
{
    public DisplayEven(int X)
    {
        super(X);
    }

    public void Even()
    {
        super.Accept();
        super.Display();

        int iCnt = 0;
        
        System.out.println("Even elements from array");
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                System.out.print(Arr[iCnt]+", ");
            }
        }
    }
}

class ArrEven
{
    public static void main(String arg[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements :");
        iValue = sobj.nextInt();

        DisplayEven dobj = new DisplayEven(iValue);
        dobj.Even();
    }
}