// Display Elements of Array

import Problems.ArrayX;
import java.util.*;

class ShowArray extends ArrayX
{
    public ShowArray(int X)
    {
        super(X);
    }

    public void Display()
    {
        super.Accept();
        super.Display();
    }
}

class Array1
{
    public static void main(String arg[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements");
        iValue = sobj.nextInt();

        ShowArray obj = new ShowArray(iValue);
        obj.Display();
    }
}