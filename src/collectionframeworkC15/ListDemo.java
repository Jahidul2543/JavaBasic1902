package collectionframeworkC15;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        storeStudentList();
    }

    public static List<String> storeStudentList(){

        List <String>  studentsList = new ArrayList<>();

        studentsList.add("Midul");
        studentsList.add("Rahul");
        studentsList.add("Nayem");
        studentsList.add("Ahad");
        studentsList.add("Saiful");
        studentsList.add("Zahidul");
        studentsList.add("Zahidul");
        studentsList.add(null);

        for(String s : studentsList){
            System.out.println(s);
        }

        studentsList.forEach(name -> System.out.println(name));

        //  System.out.println(studentsList.size());

        return studentsList;

    }

}
