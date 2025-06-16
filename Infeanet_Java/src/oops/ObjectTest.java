package oops;

public class ObjectTest {
    public static void main(String[] args) {

        // className ref_name=new className();
        Student om=new Student(); //object creation,  instantiation
        om.contact_no=1655156;
        om.id=20;
        om.division='A';
        om.name="om";
        om.marks=98;

        System.out.println("student 1:::::::::::::");
        om.doStudy("om");
        om.attendSessions();

        System.out.println("Student without toString:{" +
                "id=" + om.id +
                ", name='" + om.name + '\'' +
                ", marks=" + om.marks +
                ", contact_no=" + om.contact_no +
                ", division=" + om.division +
                '}');

//        System.out.println(om);



        Student akanksha=new Student(); //object creation,  instantiation
        akanksha.contact_no=16516;
        akanksha.id=21;
        akanksha.division='B';
        akanksha.name="akanksha";
        akanksha.marks=98.12;

        System.out.println("student 2:::::::::::::");
        akanksha.doStudy("akanksha");
        akanksha.attendSessions();
        System.out.println(akanksha);

        new Student("Disha"); //param const will be called

    }
}
