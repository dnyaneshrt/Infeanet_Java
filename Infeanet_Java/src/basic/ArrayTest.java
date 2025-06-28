package basic;

public class ArrayTest {
    public static void main(String[] args) {

        //array is collection of similler type of data elements
         int[] numbers={10,20,30,456,787,40,50,50};

         int[] num=new int[10];
//        System.out.println(numbers[3]);//40

        for(int n:numbers)
        {
            System.out.println(n);
        }
        System.out.println("rev array elements");
        for(int i= numbers.length-1;i>=0;i--)
        {
            System.out.println(numbers[i]);
        }
        System.out.println("max number from my array:");
        int max=numbers[0];
        for(int i=0;i< numbers.length;i++)
        {
            if(numbers[i]>max)
            {
                max=numbers[i];
            }
        }
        System.out.println(max);
    }
}
