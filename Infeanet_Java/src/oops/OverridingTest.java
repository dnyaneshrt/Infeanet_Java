package oops;
//can this() and super()  be used together in single constructor? No
//super cannot be used inside static context
class Iphone13
{
    Iphone13(String name)
    {
        System.out.println("parent class constructor");
    }
    String camera="20mp";
    String memory="32gb";
    String soundQuality="very good";
    //java 5:  Method co-varient return types.
    public void showDetails()
    {

        System.out.println("iphone13 :->"+camera+":"+memory+" with sound quality"+soundQuality);
    }
}

class IPhone15 extends Iphone13
{
    IPhone15()
    {
        super("java"); //super() at constructor level
        System.out.println("child class constructor");
    }
    String camera="32mp";
    String memory="64gb";
    @Override//this will make sure u are overiding correct method.
    public void showDetails()
    {
//        super.showDetails(); //will call parent class method..
        System.out.println("iphone15 :->"+super.camera+":"+memory);//super at variable level
    }
}

public class OverridingTest {
    public static void main(String[] args) {
        IPhone15 phone15=new IPhone15();  //Child class Object
//        phone15.showDetails();
    }
}


