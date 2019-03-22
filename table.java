public class table
{
    public static void main(String[] args)
    {
        int row;
        for (row=1; row<=10;row++)
        {
            int column;
            if (row==1)
            {
                column=1;
                while (column<=10)
                {
                    System.out.print("\t");
                    System.out.printf("%5s","<"+column+">");
                    column++;
                }
                System.out.print("\n");
            }
            column=1;
            while (column<=10)
            {
                if (column==1)
                    System.out.printf("%4s","<"+row+">");
                System.out.printf("%8d",row*column);
                column++;
            }
            System.out.print("\n");
        }
        System.out.print("------"+"\n");

        double rand1=(Math.random()*10);
        int maxRow=(int) rand1+1;
        double rand2=(Math.random()*10);
        int maxCol=(int) rand2+1;
        int row2;
        for (row2=1; row2<=maxRow;row2++)
        {
            int column2;
            if (row2==1)
            {
                column2=1;
                while (column2<=maxCol)
                {
                    System.out.print("\t");
                    System.out.printf("%5s","<"+column2+">");
                    column2++;
                }
                System.out.print("\n");
            }
            column2=1;
            while (column2<=maxCol)
            {
                if (column2==1)
                    System.out.printf("%4s","<"+row2+">");
                System.out.printf("%8d",row2*column2);
                column2++;
            }
            System.out.print("\n");
        }
        System.out.print("------"+"\n");

        GenerateTable(10,10);

        GenerateTable(maxRow,maxCol);
    }

    static void GenerateTable(int maxRow, int maxCol)
    {
        int row;
        for (row=1; row<=maxRow;row++)
        {
            int column;
            if (row==1)
            {
                column=1;
                while (column<=maxCol)
                {
                    System.out.print("\t");
                    System.out.printf("%5s","<"+column+">");
                    column++;
                }
                System.out.print("\n");
            }
            column=1;
            while (column<=maxCol)
            {
                if (column==1)
                    System.out.printf("%4s","<"+row+">");
                System.out.printf("%8d",row*column);
                column++;
            }
            System.out.print("\n");
        }
        System.out.print("------"+"\n");
    }
}
