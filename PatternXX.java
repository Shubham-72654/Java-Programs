package Problems.Pattern;

import java.util.*;

public class PatternXX
{
    public int iRow;
    public int iCol;

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter the number of Rows : ");
        this.iRow = sobj.nextInt();
        System.out.print("Enter the number of Columns : ");
        this.iCol = sobj.nextInt();
    }

    public void Display()
    {
        System.out.print("Rows are : "+iRow);
        System.out.print("\nColumns are : "+iCol);
    }
}