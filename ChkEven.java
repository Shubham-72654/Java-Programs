import Problems.NumberX;

class Check extends NumberX
{
    public void ChkEvenNum()
    {
        super.Accept();
        super.Display();
        
        if(iNo % 2 == 0)
        {
            System.out.println(iNo + " is Even number");
        }
        else
        {
            System.out.println(iNo + " is Odd number");
        }
    }
}

class ChkEven
{
    public static void main(String arg[])
    {
        Check obj = new Check();
        obj.ChkEvenNum();
    }
}