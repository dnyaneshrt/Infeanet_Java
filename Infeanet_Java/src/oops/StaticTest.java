package oops;


//static variables, static method, static classes
public class StaticTest {
//before java 6 we used get an output even without main method.

    static String name="java";
    static
    {
        System.out.println("i am from static block");
    }

    public void test()
    {
        System.out.println(name);
    }
    public static void main(String[] args) {
        //ClassName.method/variable
        System.out.println(Student.gender);
        Student.display();//we call static method
        System.out.println(name);
        StaticTest staticTest=new StaticTest();
        staticTest.test();;
    }
}
