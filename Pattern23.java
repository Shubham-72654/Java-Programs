// input : iRow = 4,   iCol = 4
// Output :
//      2    4    6    8
//      10   12   14   16   
//      18   20   2    4
//      6    8    10   12 

import Problems.Pattern.PatternXX;
import java.util.*;

class Display extends PatternXX
{
    public void Print(int iNo)
    {
        super.Accept();
        super.Display();

        int i = 0, j = 0, iTab = 0, iNum = 1;

        System.out.println("\nPattern is : ");
        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if (iNum > 10)
                {
                    iNum = 1;   // reset if greater than 10
                }
                iTab = iNo * iNum;
                System.out.print(iTab + "\t");
                iNum++;     // increase by 1
            }
            System.out.println("");
        }
    }
}

class Pattern23
{
    public static void main(String arg[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter the number for table: ");
        iValue = sobj.nextInt();

        Display obj = new Display();
        obj.Print(iValue);
    }
}