package Problems.Pattern;

import java.util.*;

public class PatternX
{
    public int iNo;

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter the number : ");
        this.iNo = sobj.nextInt();
    }

    public void Display()
    {
        System.out.print("Enter number is : "+iNo);
    }
}