package Class14;

public class TwoDimensionalArrayDemo {

    public static void main( String[] args )
    {
        // declare and construct a 2D array
        int[][] gradeTable =
                     {  {99, 42, 74, 83, 100},
                        {90, 91, 72, 88, 95},
                        {88, 61, 74, 89, 96},
                        {61, 89, 82, 98, 93},
                        {93, 73, 75, 78, 99},
                        {50, 65, 92, 87, 94},
                        {43, 98, 78, 56, 99}  };

        System.out.println("grade 0,0: " + gradeTable[0][0]);
        System.out.println("grade 2,4: " + gradeTable[2][4]);

        gradeTable[5][3] = 99 ;

        int sum = gradeTable[0][1] + gradeTable[0][2] ;
        System.out.println( "sum: " + sum );
    }
}
