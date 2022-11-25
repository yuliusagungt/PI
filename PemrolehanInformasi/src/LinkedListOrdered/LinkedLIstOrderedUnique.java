package LinkedListOrdered;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class LinkedLIstOrderedUnique<E> extends LinkedList<E> {

    LinkedLIstOrderedUnique dataDokumen;
    ArrayList<String> dataTampung = new ArrayList<String>();

    public boolean addSort(E value) {
        ListIterator<E> iteratorData = this.listIterator();
        while (iteratorData.hasNext()) {
            E data = iteratorData.next();
            if (((Comparable) data).compareTo(value) > 0) {
                iteratorData.previous();
                iteratorData.add(value);
                return true;
            } else if (((Comparable) data).compareTo(value) == 0) {
                return true;
            }
        }
        iteratorData.add(value);
        return true;
    }

    public boolean addTerm(Term value) {
        ListIterator<E> iteratorData = this.listIterator();
        while (iteratorData.hasNext()) {
            Term data = (Term) iteratorData.next();
            if (((Comparable) data.getWord()).compareTo(value.getWord()) > 0) {
                iteratorData.previous();
                iteratorData.add((E) value);
                return true;
            } else if (((Comparable) data.getWord()).compareTo(value.getWord()) == 0) {
                return true;
            }
        }
        iteratorData.add((E) value);
        return true;
    }

    public void search(String data) {
        Term value = new Term(data);
        ListIterator<E> iterator = this.listIterator();
        
        while (iterator.hasNext()) {
            Term temp = (Term) iterator.next();
            if ((temp.getWord()).equalsIgnoreCase(value.getWord())) {
                System.out.println("Kata '" + temp.getWord() + "' ditemukan!");
                System.out.print("Terletak di : " + temp.getDokumen());
                System.out.println("");
            }
        }       
    }

    public void getDaftarDoc() {
        //use distinct
        List<String> dataUniq = dataTampung.stream().distinct().collect(Collectors.toList());
        Iterator<String> it = dataUniq.iterator();
        System.out.print("\nBerada di : ");
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
    }

    public Term getInputString(String value) {
        ListIterator<E> iterator = this.listIterator();
        while (iterator.hasNext()) {
            Term temp = (Term) iterator.next();
            if (((Comparable) temp.getWord()).compareTo(value) == 0) {
                return temp;
            }
        }
        return null;
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

}