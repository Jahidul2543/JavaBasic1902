package problems;

public class RemoveSpacesFromString {

    public static void main(String[] args) {
        RemoveSpacesFromString obj = new RemoveSpacesFromString();
        System.out.println("New Index " + obj.removeSpace());

    }

    public int removeSpace(){
        String name = "Jahiudl Islam";
        StringBuffer stringBuffer = new StringBuffer(name);

        int newLengthOfArray =0;
        char[] charArray= new char[name.length()];

        for (int i =0; i<charArray.length; i++ ){
            charArray[i] = name.charAt(i);

            //  System.out.print(charArray[i]);

            if(charArray[i]!=' '){
                // System.out.print(charArray[i]);
                newLengthOfArray = i;
            }
        }
        return newLengthOfArray;
    }
}
/**
 * Instead of returning newLengthOfArray return new String without space.
 *
 *
 * */