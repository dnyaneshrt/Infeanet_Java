package collections;

import java.util.*;

//set does not allow duplicate elements
public class SetTest {
    //abbcccddeeff

    public static void removeDuplicates(String str)
    {
        char[] chars=str.toCharArray();
        Set set=new HashSet();
        for(int i=0;i<chars.length;i++)
        {
            set.add(chars[i]);
        }
        for(Object s:set)
        {
            System.out.print(s);
        }
    }

    public static void main(String[] args) {
        Set set=new TreeSet();
        set.add("sadhana");
        set.add("om");
        set.add("samarth");
        set.add("sadhana");
        set.add("sanika");
        set.add("shifa");
        set.add("aaniket");
        set.add("arti");

        set.forEach(System.out::println);

//        String str="abbcccddeeff";
//        System.out.println(str);
//        System.out.println("after removing duplicates");
//        removeDuplicates(str);

        List l=new ArrayList();
        l.add(set);

        System.out.println(l);
        l.sort(Comparator.reverseOrder());
        System.out.println(l);
    }
}
