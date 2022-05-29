package Problems;

import java.lang.*;
import java.util.*;

public class NumberX
{
    public int iNo;

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        this.iNo = sobj.nextInt();
    }

    public void Display()
    {
        System.out.println("Value is : " + this.iNo);
    }
}
