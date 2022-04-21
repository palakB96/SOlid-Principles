package DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLIst {

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("PLease enter no. of elements for list : ");
        int n = s.nextInt();
        System.out.println("PLease enter no. of elements for list1: ");
        int m = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);
        ArrayList<Integer> list1 = new ArrayList<>(m);
        for(int i = 0; i < n; i++)
        {
            list.add(i);
            System.out.println(list);

        }
        list1.add(20);
        list1.add(30);
        System.out.println("remove element at index 3 " + list.remove(3));
        System.out.println(list);
        boolean elementPresent = list.contains(5);
        System.out.println(elementPresent);

        boolean empty = list.isEmpty();
        System.out.println(empty);

        list.clear();

        list.addAll(list1);
        System.out.println(list);
    }
}
