package oops;

public class Student {

    //zero param constructor
    Student()
    {
        System.out.println("Student constructor called!!!");
    }

    //parameterized constructor
    Student(String name) {
        System.out.println("Student constructor called!!! " + name);
    }

    //instance variables
    int id;
    String name;
    double marks;
    long contact_no;
    char division;

    //instance method or non-static method.
    public void doStudy(String name)
    {
        System.out.println("student "+name+" does study");
    }

    public void attendSessions()
    {
        System.out.println("student attends sessions regularly...");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", contact_no=" + contact_no +
                ", division=" + division +
                '}';
    }

    //✅ What is a Copy Constructor?
    //A copy constructor is a constructor that creates a new object by copying the values of another object of the same class.
    // Copy constructor
 /*   public Student(Student other) {
        this.name = other.name;
        this.age = other.age;
    }*/
}
