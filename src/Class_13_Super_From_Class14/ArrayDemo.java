package Class_13_Super_From_Class14;

public class ArrayDemo {

    public static void main(String[] args) {

        ArrayDemo objArrayDemo = new ArrayDemo();
        objArrayDemo.storeStudentNameInAnArray();
        objArrayDemo.divide(2, 0);
    }

    public void storeStudentNameInAnArray(){

        /*String[] students = new String[3];
        students[0] = "Rahul";
        students[1] = "Midul";
        students[2] = "Zahidul";
        students[3] = "Nayem";

        for (int i =0;i<students.length; i++) {

            System.out.println(students[i]);

        }
*/

        try {

            String[] students = new String[4];
            // Adding data in students array container
            students[0] = "Rahul";
            students[1] = "Midul";
            students[2] = "Zahidul";
            students[3] = "Nayem";

            for (int i =0;i<students.length; i++) {

                System.out.println(students[i]);

            }

        }
        catch (Exception e){

            e.printStackTrace();

            System.out.println("You are trying to add student more than your capacity");
        }
        //System.out.println(students.length);

    }

    public void divide(int x, int y){

      try {
          int div = x/y;
      }

      catch (ArithmeticException e){
          e.printStackTrace();
          System.out.println("Number cant be divided by zero");
      }

    }

}
