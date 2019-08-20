package collectionframeworkC15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

       ArrayListDemo obj = new ArrayListDemo();
       obj.findElementNameBasedOnFirstLetter('Z');
       obj.findElementIndexBasedOnElementName("Ahad");

    }

    public List<String> storeStudentList(){

        List <String>  studentsList = new ArrayList<>();

        studentsList.add("Midul");
        studentsList.add("Rahul");
        studentsList.add("Nayem");
        studentsList.add("Ahad");
        studentsList.add("Saiful");
        studentsList.add("Zahidul");
        studentsList.add("Zahidul");


      //  System.out.println(studentsList.size());

        return studentsList;

    }

    public  void findElementNameBasedOnFirstLetter(char charAtIndex0){

        for (int i =0; i<storeStudentList().size(); i++){

            String element = storeStudentList().get(i);

            if(element.charAt(0)==charAtIndex0){
                System.out.println("ElementNameBasedOnFirstLetter is at index_" + i + " value = " + element);
            }

        }
    }
    public int findElementIndexBasedOnElementName(String nameToSearch){

        int indexNUmber = 0;
        for (int i =0; i<storeStudentList().size(); i++){

            String element = storeStudentList().get(i);

           if(element== nameToSearch){

               System.out.println("Element "+ element +"'s Index is " + i);
               indexNUmber = i;
           }

        }
        return indexNUmber;
    }
}

