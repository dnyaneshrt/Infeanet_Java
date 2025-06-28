package string;

public class StringTest {
    public static void main(String[] args) {
        //2 ways to create String.

        String str1="infeanet"; //String literal
        String str2=new String("infeanet"); //new keyword(String Object)

        String str3="infeanet";
        String str4=new String("Infeanet");

        System.out.println(str1==str2);  //comparison operator (true/false)  >,<,==,!=  if(5>6)//false  if(5==5) //true
        System.out.println(str1==str3);
        System.out.println(str2==str4);  //comparing the reference

     //   equals()  method to compare Strings. == operator compares ref
        System.out.println(str2.equals(str4));  //false
        System.out.println(str2.equalsIgnoreCase(str4));  //true  // a!=A
    }
}
