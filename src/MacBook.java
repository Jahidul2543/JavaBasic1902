public class MacBook {

    int x = 4;
    //String color = "Red";
    // NameOfClass nameOfObject = new Constructor
    // Constructor name has to be same as class nameOfObject
    // with ()
    // This variable declaration
    String shade;
    // assigning value to the to variable.

    public MacBook(){
        System.out.println("I am default constructor");
    }

    public MacBook(String shade){
        //this.color = shade;
        System.out.println(shade);
    }

    public static void main(String[] args){
        System.out.println("I am inside main method");
        MacBook myMacBook = new MacBook();
        //ObjectName.methodName();
        myMacBook.login();
        MacBook myRedMacBook = new MacBook("Red");
        myRedMacBook.login();
        int grade = (int)'j';
        System.out.println(grade);

    }

    public void login(){
        System.out.println("This will allow you to log in to the myMacBook");
    }


}
/**
 * 1. Class
 * 2. Main method
 * 3. Object
 * 4. method
 * 5. Data type
 * 6. Constructor
 * 7. Access modifier
 * 8. Homework 100 java classes show all your hard earned knowledge
 *
 *
 * */