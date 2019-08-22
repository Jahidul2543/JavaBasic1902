package databaseconnectivity;

import org.omg.CORBA.CODESET_INCOMPATIBLE;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Students {

    public static void main(String[] args) throws SQLException {
       // getStudentName();
       // getStudentGrade();
       // getStudentsTable();
       // createTeachersTable();
        ConnectDB.storeTableInMap();
    }

    public static void getStudentsTable(){

        ConnectDB connectDB = new ConnectDB();
        ResultSet resultSet = connectDB.executeSelectStatement("students");
        List<String>  records;
      try {
         records = connectDB.processThreeFieldsFromResultset(resultSet,"id", "name", "grade");
        // records.forEach(string -> System.out.println(records));
          for(String str: records){
              System.out.println(str);
          }

      }
      catch (SQLException e){
          e.printStackTrace();
      }
    }

    public static void createTeachersTable(){
        ConnectDB connectDB = new ConnectDB();
        connectDB.createTableFromStringToMySql("teachers", "teachersName");
    }



   /* public static void getStudentName(){
        ConnectDB connectDB = new ConnectDB();
        List<String> studenNameList = new ArrayList<>();
        studenNameList = connectDB.executeSelectStatement("name");
        System.out.println("******" + "Get Name " + "*******");
       for(String str : studenNameList){
           System.out.println(str);
       }

    }

    public static void getStudentGrade(){
        ConnectDB connectDB = new ConnectDB();
        List<String> studenNameList = new ArrayList<>();
        studenNameList = connectDB.executeSelectStatement("grade");

        System.out.println("******" + "Get Grade " + "*******");
        for(String str : studenNameList){
            System.out.println(str);
        }

    }*/

}
