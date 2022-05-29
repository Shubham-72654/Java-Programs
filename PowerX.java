package Problems;

import java.util.*;

public class PowerX
{
    public int iNo1 = 0, iNo2 = 0;

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Value-1 : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter Value-2 : ");
        iNo2 = sobj.nextInt();
    }

    public void Display()
    {
        System.out.println("Value-1 is "+ iNo1 + " and Value-2 is "+ iNo2);
    }
}