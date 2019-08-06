package Class_13.inheritance;

public class Nokia6600 extends Nokia1100 {

    public void internet(){
        System.out.println("Internet");
    }

    public void camera(){
        System.out.println("This is camera");
    }

    public static void main(String[] args) {
        Nokia6600 objNokia6600 = new Nokia6600();
        objNokia6600.camera();
        objNokia6600.internet();
        objNokia6600.phoneBook();
        objNokia6600.makeCall();
        objNokia6600.sendText();
    }
}
