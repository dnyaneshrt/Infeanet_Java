package collections;

import java.util.*;

//ArrayList DS which allows deplicates.

public class ListTest {
    public static void main(String[] args) {
        List list=new ArrayList();  //upcasting...
        list.add("ayush");//    if add() available  is not in child-> Parent
        list.add("kritika");
        list.add("mahadev");
        list.add("navya");
        list.add("pragati");
        list.add("ayush");//    if add() available  is not in child-> Parent
        list.add("kritika");
        list.add("mahadev");
        list.add("navya");
        list.add("pragati");


        List nums=new ArrayList();
        nums.add(100);
        nums.add(200);

        for(Object l:list)
        {
            System.out.println(l);
        }

        System.out.println(list.size());
        list.add(4,"rutuja");

        for(Object l:list)
        {
            System.out.println(l);
        }
        System.out.println( list.contains("pragatii"));
        System.out.println(list.isEmpty());
//        list.add(nums);
//
//        for(Object l:list)
//        {
//            System.out.println(l);
//        }

        System.out.println("sort in Asc order::");
//        for(Object l:list)
//        {
//            System.out.println(l);
//        }

//        list.forEach(System.out::println);
        System.out.println("############");
        Collections.sort(list);

      Iterator it= list.iterator();
      while(it.hasNext())
      {
          System.out.println(it.next());
      }


        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
}
