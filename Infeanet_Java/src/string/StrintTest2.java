package string;

public class StrintTest2 {

    public static void main(String[] args) {
        String myString="My Java is a high-level, general-purpose, memory-safe, object-oriented programming language. It is intended to let programmers write once, run anywhere, meaning that compiled Java code can run on all platforms that support Java without the need to recompile.";

        System.out.println("length of this String is: "+myString.length());

        String[] words=myString.split(" ");
        System.out.println("total no of words are there :"+words.length);
        int count=1;
        for(String str:words)
        {
            System.out.println(str+":"+count++);
        }


        String[] sentences=  myString.split("\\.");
        System.out.println("total sentences are: "+sentences.length);
        count=1;
        for(String s:sentences)
        {
            System.out.println(s+":"+count++);
        }

        System.out.println("to Uppercase: "+myString.toUpperCase());
        System.out.println("to Lowercase: "+myString.toLowerCase());


        String str="my name is java";
        System.out.println("is java contains: "+str.contains("java"));
        System.out.println(str.replace('a','*'));

        System.out.println(str.substring(4));
        System.out.println(str.substring(4,10));

        String s1="Hi";
        String s2="Hello";
        System.out.println(s1+s2);
        System.out.println(s1.concat(s2));
    }
}
