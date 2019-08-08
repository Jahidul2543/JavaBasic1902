package Class_13_Super_From_Class14.inheritance;

public abstract class PreNokia1100 implements Symbian, SymbianV2 {

    /**
     * A class with at least one abstract method is called abstract class
     * */

    public void makeCall(){
        System.out.println("This method can make call in PreNokia1100 abstract class");
    }

    public void sendText(){
        System.out.println("This method can send text in PreNokia1100 abstract class");
    }
    public void display(){

    }


    public abstract void snakeGame();

    public  abstract void phoneBook();


}
