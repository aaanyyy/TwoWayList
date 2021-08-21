package UI;


import Util.TwoWayList;
import lombok.RequiredArgsConstructor;

import java.util.Iterator;
import java.util.Scanner;

@RequiredArgsConstructor
public class ListView {
    private final Scanner sc;

    public  Integer readValue()
    {
        System.out.println("Please enter a number");
        int value=sc.nextInt();
        sc.nextLine();
        return value;
    }
    public void showList(TwoWayList<Integer> list)
    {
        if(list.getSize()==0) System.out.println("the list is empty");
        Iterator<Integer> it=list.iterator();

        System.out.print("{ ");
        while(it.hasNext())
            System.out.print(it.next()+" ");
        System.out.println("}\n");

    }

    public void showListBackwardOrder(TwoWayList<Integer> list)
    {
        if(list.getSize()==0) System.out.println("the list is empty");
        Iterator<Integer> it=list.iteratorBackward();
        System.out.print("{ ");
        while(it.hasNext())
            System.out.print(it.next()+" ");
        System.out.print("}\n");

    }


    public void showElement(TwoWayList<Integer> list) {
        System.out.println("Please enter index of the element");
        int index= sc.nextInt();
        sc.nextLine();
        System.out.println("The value is "+list.get(index)+"\n");


    }

    public boolean deleteElement(TwoWayList<Integer> list) {
        System.out.println("Please enter index of the element to delete");
        int index= sc.nextInt();
        sc.nextLine();
        return list.delete(index);

    }

    public void showSize(TwoWayList<Integer> list) {

        System.out.println("The size is "+list.getSize()+"\n");

    }
}
