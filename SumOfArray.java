// Summation of elements of array

import Problems.ArrayX;
import java.io.*;

class SumArray extends ArrayX
{
    public SumArray(int A)
    {
        super(A);    // Call the parameterized constructor from ArrayX class
    }
    public int SummationArr()
    {
        super.Accept(); // call method from ArrayX class
        super.Display(); // call method from ArrayX class

        int iCnt = 0, iSum = 0;
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }
        return iSum;
    }
}

class SumOfArray
{
    public static void main(String arg[])
    {
        int iValue = 0, iRet = 0;
        try
        {
            InputStreamReader iobj = new InputStreamReader(System.in);
            BufferedReader bobj = new BufferedReader(iobj);

            System.out.println("Enter number of elements");
            iValue = Integer.parseInt(bobj.readLine());

            SumArray obj = new SumArray(iValue);
            
            iRet = obj.SummationArr();
            System.out.println("Summation of Array is : " + iRet);
        }
        catch(Exception eobj)
        {
            System.out.println("Exception is : " + eobj);
        }
    }
}