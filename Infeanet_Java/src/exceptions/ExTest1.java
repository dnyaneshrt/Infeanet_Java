package exceptions;

import java.util.Scanner;

public class ExTest1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Exception test 1");
//        int[] numbers=new int[5];
//        numbers[2]=25;
//        numbers[4]=50;
//        numbers[5]=100;
//
//        for(int i=0;i< numbers.length;i++)
//        {
//            System.out.println(numbers[i]);
//        }
//        System.out.println("imp code");

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number");
            int num1 = scanner.nextInt();

            System.out.println("Enter second number");
            int num2 = scanner.nextInt();

            System.out.println(num1 / num2);


        }catch(ArrayIndexOutOfBoundsException e)
        {

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("please enter correct values");

        }
        finally
        {
            System.out.println("imp code");
        }


            Thread.sleep(100);



    }
}
