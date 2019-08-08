package Class_13_Super_From_Class14.inheritance;

public class Nokia1100 extends PreNokia1100{

    public Nokia1100(){
        System.out.println("I am Nokia1100  constructor");

    }


    public void snakeGame(){
        System.out.println("This is game method");
    }

    public  void phoneBook(){
        System.out.println("Phone book");
    }


    public static void main(String[] args) {
        Nokia1100 objNokia1100 = new Nokia1100();
        objNokia1100.snakeGame();
        objNokia1100.phoneBook();
        objNokia1100.makeCall();
        objNokia1100.sendText();
    }

}
