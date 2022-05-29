import Problems.NumberX;

class CheckAmount
{
    public void ShowBill()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("\nWelcome to our Portal");
        System.out.println("Choose how many Gold (in gram) do you want ?");
        System.out.println("1: 1 Gram");
        System.out.println("2: 2 Gram");
        System.out.println("3: 5 Gram");
        System.out.println("4: 10 Gram");
        System.out.println("5: 20 Gram");
        int iNo = sobj.nextInt();

        switch(iNo)
        {
            case 1:
                System.out.println("Your Billing Amount is 5000");
                break;
            
            case 2:
                System.out.println("Your Billing Amount is 10000");
                break;
            
            case 3:
                System.out.println("Your Billing Amount is 25000");
                break;

            case 4:
                System.out.println("Your Billing Amount is 50000");
                break;

            case 5:
                System.out.println("Your Billing Amount is 100000");
                break;

            default:
                System.out.println("Choose valid Weight");
        }
        System.out.println("Thanks for visit....visit again!");
    }
}

class SwitchBill
{
    public static void main(String a[])
    {
        CheckAmount obj = new CheckAmount();
        obj.ShowBill();
    }
}