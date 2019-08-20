package getterSetter;

public class GetValue {

    public static void main(String[] args) {
        GetterAndSetterDemo obj = new GetterAndSetterDemo();

        System.out.println(obj.getX());

        obj.setX(12);

        System.out.println(obj.getX());

    }
}
