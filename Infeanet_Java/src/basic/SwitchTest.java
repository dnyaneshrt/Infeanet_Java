package basic;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {

        while(true) {
            System.out.println("\n\n########## welcome to book my show app: ############");
            System.out.println("1. harry Potter");
            System.out.println("2. titanic");
            System.out.println("3. final destination");
            System.out.println("4. Anabella");
            System.out.println("5. don't want to watch movie");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter movie choice:");
            int choice = scanner.nextInt();


//            switch (choice) {
//                case 1:
//                    System.out.println("watching harry Potter");
//                    break;
//                case 2:
//                    System.out.println("watching titanic");
//                    break;
//                case 3:
//                    System.out.println("watching final destination");
//                    break;
//                case 4:
//                    System.out.println("watching Anabella");
//                    break;
//                case 5:
//                    System.out.println(" don't want to watch movie");
//                    break;
//                default:
//                    System.out.println("invalid choice");
//            }
            switch (choice) {
                case 1->
                    System.out.println("watching harry Potter");

                case 2->
                    System.out.println("watching titanic");

                case 3->
                    System.out.println("watching final destination");

                case 4->
                    System.out.println("watching Anabella");

                case 5->
                    System.out.println(" don't want to watch movie");

                default->
                    System.out.println("invalid choice");
            }

            System.out.println("Do you want to exit from app? y/n");
            char ch=scanner.next().charAt(0);

            if(ch=='y')
            {
                System.exit(0);
            }
        }

    }
}
