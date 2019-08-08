package Class_13_Super_From_Class14.inheritance;

public class Nokia6600 extends Nokia1100 {

    /**
     * Java does not support multiple inheritance
     * But a class can implement multiple interfaces
     *
     * */

    public Nokia6600(){
        // Super class constructor
        super();

    }

    public void internet(){
        super.phoneBook();
        System.out.println("Internet");
    }

    public void internet(String fiveG){
        System.out.println("5G  " + fiveG);
    }


    public void camera(){
        System.out.println("This is camera");

    }

    public void phoneBook(){
        System.out.println("This enha");
    }

    public static void main(String[] args) {
        Nokia6600 objNokia6600 = new Nokia6600();
        objNokia6600.camera();
        objNokia6600.internet();
        objNokia6600.internet("enabled");

/*
        objNokia6600.phoneBook();
        objNokia6600.makeCall();
        objNokia6600.sendText();

*/


    }
}
