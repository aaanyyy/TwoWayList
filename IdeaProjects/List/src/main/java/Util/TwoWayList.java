package Util;


import java.awt.*;
import java.util.Collection;
import java.util.Iterator;

public class TwoWayList<T> implements Iterable {

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            ListItem<T> current=head;
            @Override
            public boolean hasNext() {
                return current!=null;
            }

            @Override
            public T next() {

                current=current.next;
                if(current==null) return tail.value;

                return current.prev.value;
            }
        };
    }



    public Iterator<T> iteratorBackward() {
        return new Iterator<T>() {
            ListItem<T> current=tail;
            @Override
            public boolean hasNext() {
                return current!=null;
            }

            @Override
            public T next() {
                current=current.prev;
                if (current==null) return head.value;
                return current.next.value;
            }
        };
    }

    public boolean delete(int index) {

        if(index>=size) return false;

        if(index==0)
        {
            size--;
            head=head.next;
            if(head==null)
            {
                tail=null; return true;
            }

            head.prev=null; return true;

        }
        if(index==size-1)
        {
            size--;
            tail=tail.prev;
            tail.next=null;
            return true;

        }

        ListItem<T> result;
        if(index>size/2)
        {
            result = tail;
            for(int i=size-1;i>index;i--)
                result=result.prev;
        }
        else{
            result = head;
            for(int i=0;i<index;i++)
                result=result.next;
        }

        result.prev.next=result.next;
        result.next.prev=result.prev;
        size--;
        return true;

    }


    public static class ListItem<T> {
        ListItem<T> prev;
        ListItem<T> next;

        T value;

        ListItem(T value) {
            this.value = value;
        }

    }


    private ListItem<T> head;
    private ListItem<T> tail;
    int size=0;

    public int getSize() {
        return size;
    }

    public void add(T elem)
    {
        size++;
        ListItem<T> listItem=new ListItem<>(elem);
        if(tail==null)
        {
            head=tail=listItem;
        }
        else
        {
            tail.next=listItem;
            listItem.prev=tail;
            tail=listItem;

        }

    }
    public void addAll(TwoWayList<T> list)
    {
        for (int i=0;i<list.getSize();i++)
            add(list.get(i));
    }

    public T get(int index)
    {
        if(index>size) return null;//throw new UnsupportedOperationException();
        ListItem<T> result;
        if(index>size/2)
        {
            result = tail;
            for(int i=size-1;i>index;i--)
                result=result.prev;
        }
        else{
            result = head;
            for(int i=0;i<index;i++)
                result=result.next;
        }
        return result.value;

    }

}
