package oops;

//this keyword can be used with variable, method and constructor.  this()
//this() always should be at the first line in constructor
//this cannot be referenced from a static context
class Car
{
    Car()
    {
        this("Car24");
        System.out.println("zero param constructor!");
    }

    Car(String name)
    {
        System.out.println(" param constructor!" +name);
    }
    //instance variables
    String brandName="bmw";
    String colour="black";
    int carNumber=1111;

    //instance method
    public void displayCarInfo(String name)
    {
        //local variables.
        String brandName="swift";
        String colour="white";
        int carNumber=2222;

        System.out.println("Car: {" +
                "brandName='" + this.brandName + '\'' + //this at variable level
                ", colour='" + this.colour + '\'' +
                ", carNumber=" +carNumber +
                '}');

    }

    public void show()
    {
        System.out.println("inside show method::");
        displayCarInfo("test");  //this at method level
        // this.displayCarInfo("test");  //this at method level
    }

    public static void main(String[] args) {
        Car car=new Car();
        car.show();
    }
}
