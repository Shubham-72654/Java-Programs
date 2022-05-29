// input : iRow = 6,   iCol = 6
// Output :
//      *   *   *   *   *   *
//      *   *   $   $   $   *
//      *   &   *   $   $   *
//      *   &   &   *   $   *
//      *   &   &   &   *   *
//      *   *   *   *   *   *
// It is Diagonal so write filter 
import Problems.Pattern.PatternXX;

class Display extends PatternXX
{
    public void Print()
    {
        super.Accept();
        super.Display();

        if(iRow != iCol)
        {
            System.out.println("\nRow and Columns are not found same");
            return;
        }

        int i = 0, j = 0;

        System.out.println("\nPattern is : ");
        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if((i == 1) || (i == iRow) || (j == 1) || (j == iCol) || (i == j))
                {
                    System.out.print("*\t");
                }
                else if(i > j)
                {
                    System.out.print("&\t");
                }
                else if(j > i)
                {
                    System.out.print("$\t");
                }
            }
            System.out.println("");
        }
    }
}

class Pattern15
{
    public static void main(String arg[])
    {
        Display obj = new Display();
        obj.Print();
    }
}