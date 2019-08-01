package Class_12;

public class OperatorDemo {

    public static void main(String[] args) {
        // Declaration of variable
        int x ;

        /**
         * Assigning value to the variable x
         * Assignment operator =
         *
         */
         x = 8;
         int y = 4;
         int sum = x + y;
         int mult = x*y;
         // 8/4
         int div = x/y;
         int a = 7;
         int b = 6;

        // a==b true
        // x>y true
        // x<y false
        // x != y true

       // OperatorDemo objOperatorDemo = new OperatorDemo();
        // objOperatorDemo.compareTwoInteger(12000, 1000);
        Helper objHelper = new Helper();
        objHelper.compareTwoInteger(12222, 10000);



    }

   /* public void compareTwoInteger(int a, int b  ){



        if (a == b) {
            System.out.println(" a is equal to b");
        }
        else if (a<b){
            System.out.println("a is less than b");

        }
        else if (a>b){
            System.out.println("a is greater than b");
        }

        else {
            System.out.println(" I am inside else block");
        }

    }*/

}
