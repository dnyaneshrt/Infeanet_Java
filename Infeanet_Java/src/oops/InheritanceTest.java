package oops;

//final class Parent:-
class Parent
{
    final int bank_balance=50000;//we use final keyword at variable level
    boolean isHavingCar=true;
    String className="parent class";

    public final void showParentDetails()
    {
//        bank_balance=10000; //cannot be changed.
        System.out.println("Parent{" +
                "bank_balance=" + bank_balance +
                ", isHavingCar=" + isHavingCar +
                ", className='" + className + '\'' +
                '}');
    }
    public final void marriage()
    {
        System.out.println("Om will get married with : SwaranjaliLaxi/ jaylaltia");
    }
}

class Child extends Parent
{
 public void showChildDetails()
 {
     System.out.println("child class");
 }
//final methods cannot be overridden
//    public void marriage()
//    {
//        System.out.println("Om will get married with : katrina/ shradha");
//    }
}
public class InheritanceTest {
    public static void main(String[] args) {
        Child child=new Child();//Created an Object of Child class
//        child.showChildDetails();
//        child.showParentDetails();// allowed
//        System.out.println(child.bank_balance);
        child.marriage();
    }
}
