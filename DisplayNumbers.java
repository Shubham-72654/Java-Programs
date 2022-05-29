import Problems.NumberX;

class Display extends NumberX
{
    public void DisplayNum()
    {
        super.Accept();
        super.Display();

        int iCnt = 0;
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.println(iCnt);
        }
    }
}

class DisplayNumbers
{
    public static void main(String a[])
    {
        Display obj = new Display();
        obj.DisplayNum();
    }
}