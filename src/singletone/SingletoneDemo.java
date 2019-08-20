package singletone;

public class SingletoneDemo {

  //  SingletoneDemo objSingletoneDemo = new SingletoneDemo();

    private SingletoneDemo(){

    }
    public static SingletoneDemo getObjSingletoneDemo() {
        SingletoneDemo objSingletoneDemo = new SingletoneDemo();
        return objSingletoneDemo;
    }

    public void login(String userName, String password){
        System.out.println("Do Login");
    }
}
