package string;

public class StringRevTest {
      public static String revString(String str)
      {
          String str_rev="";
          for(int i=str.length()-1;i>=0;i--)
          {
              str_rev=str_rev+str.charAt(i);
          }
          return str_rev;
      }

    public static void main(String[] args) {
          String str="I am learning in infeanet";
//        System.out.println(str.charAt(5));  //n
//        System.out.println(str.indexOf('f'));//2


        System.out.println("string before reversing: "+str);
        System.out.println("string after reversing: "+revString(str));

        System.out.println("reversing my String word by word:");
        String[] words= str.split(" ");
        for(String word: words)
        {
            word+=" ";
            System.out.print(revString(word));
        }

    }
}
