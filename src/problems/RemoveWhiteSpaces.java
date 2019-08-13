package problems;

class RemoveWhiteSpaces
{
    public static void main(String[] args)
    {
       /* String str1 = "Saket Saurav        is an Autom ation Engi ne      er";

        char[] chars = str1.toCharArray();

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < chars.length; i++)
        {
            if( (chars[i] != ' ') && (chars[i] != '\t') )
            {
                sb.append(chars[i]);
            }
        }
        System.out.println(sb);          */ //Output : CoreJavajspservletsjdbcstrutshibernatespring
    demo();
    findASpecificLetterCountFromASentence();
    }

    public static void demo(){
        String name = "Md Jahidul Islam";
        char[] chars = name.toCharArray();
        System.out.println(chars);
        StringBuffer sb = new StringBuffer();

        for (int i =0; i<chars.length; i++){

           if(chars[i]!=' ' && chars[i] !='\t') {
               sb.append(chars[i]);
           }
        }
        System.out.print(sb);
    }

    public static void findASpecificLetterCountFromASentence(){
        String moto = "We train, we hire, we develop, we test";
        char[] chars = moto.toCharArray();
        //StringBuffer sb = new StringBuffer();

        for (int i = 0; i<chars.length; i++){
            if(chars[i] == 'w'){
                System.out.println("Number of w: " + i);
            }
        }
    }
}
