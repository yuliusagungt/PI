package LinkedListOrdered;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListOrdered<E> extends LinkedList<E> {

    LinkedList<E> linkedList = new LinkedList();

    public boolean addSort(E e) {
        ListIterator<E> iterator = this.listIterator();
        while (iterator.hasNext()) {
            E data = iterator.next();
            if (((Comparable) data).compareTo(e) > 0) {
                iterator.previous();
                iterator.add(e);
                return true;
            } else if (((Comparable) data).compareTo(e) == 0) {
                return true;
            }
        }
        iterator.add(e);
        return true;
    }
    
        public E get(E value) {
        ListIterator<E> iterator = this.listIterator();
        while (iterator.hasNext()) {
            E temp = iterator.next();
            if (((Comparable) temp).compareTo(value) == 0) {
                return temp;
            }
        }
        return null;
    }
//    
//    public String addSort2(E e) {
//        ListIterator<E> iterator = this.listIterator();
//        while (iterator.hasNext()) {
//            E data = iterator.next();
//            if (((Comparable) data).compareTo(e) > 0) {
//                iterator.previous();
//                iterator.add(e);
//                return null;
//            } else if (((Comparable) data).compareTo(e) == 0) {
//                return null;
//            }
//        }
//        iterator.add(e);
//        return null;
//    }
}