package Problems;

import java.lang.*;
import java.util.*;

public class ArrFreqX
{
    public int Arr[];
    public int iSearch;

    public ArrFreqX(int iNo)
    {
        Arr = new int[iNo];
    }

    public void Accept()
    {
        int iCnt = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        System.out.print("Enter the Number for search : ");
        this.iSearch = sobj.nextInt();
    }

    public void Display()
    {
        int iCnt = 0;

        System.out.println("Elements of Array are : ");
        for (iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.print("|" + Arr[iCnt] + "|-> ");
        }

        System.out.print("\nyou want to search : ");
        System.out.println(iSearch);
    }
}
