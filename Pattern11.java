// input : iRow = 4,   iCol = 4
// Output :
//      $   *   *   *
//      #   $   *   *
//      #   #   $   *
//      #   #   #   $
// it is Diagonal so filter is compulsory

import Problems.Pattern.PatternXX;

class Display extends PatternXX
{
    public void Print()
    {
        super.Accept();
        super.Display();

        if(iRow != iCol)
        {
            System.out.println("\nRow and Column are not found equal");
            return;
        }

        int i = 0, j = 0;

        System.out.println("\nPattern is : ");
        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(i == j)
                {
                    System.out.print("$\t");
                }
                else if(i < j)
                {
                    System.out.print("*\t");
                }
                else if(j < i)
                {
                    System.out.print("#\t");
                }
            }
            System.out.println("");
        }
    }
}

class Pattern11
{
    public static void main(String arg[])
    {
        Display obj = new Display();
        obj.Print();
    }
}