package exceptions;


import java.util.Scanner;

class ChangeNotAvailableException extends  Exception{
    ChangeNotAvailableException()
    {
        super("Please keep change!!!!");
    }
}

public class ThrowTest {

    public void acceptBill(int amount)
    {
        if(amount==2000)
        {
            try {
                throw new ChangeNotAvailableException();
            } catch (ChangeNotAvailableException e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println("payment accepted!!");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter amount");
        int amount=sc.nextInt();

        ThrowTest throwTest=new ThrowTest();
        throwTest.acceptBill(amount);
    }
}
