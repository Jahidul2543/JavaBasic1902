package singletone;

public class Login {
    public static void main(String[] args) {

      SingletoneDemo obj =  SingletoneDemo.getObjSingletoneDemo();
      obj.login("Jahiudl", "1234");

    }
}
