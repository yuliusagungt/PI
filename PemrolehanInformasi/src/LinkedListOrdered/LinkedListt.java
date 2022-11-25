//package LinkedListOrdered;
//
//import java.util.LinkedList;
//import java.util.ListIterator;
//
//public class LinkedListt {
//
//    public static void main(String[] args) {
//        LinkedList<String> linkedList = new LinkedList();
//        linkedList.addFirst("aaa");
//        linkedList.addLast("bbb");
//        linkedList.addLast("ddd");
//
//        ListIterator iterator; //iterator pada null
//        iterator = linkedList.listIterator(); //iterator pada linkedlist kosong
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        System.out.println("");
//        System.out.println(iterator.previous());
//        iterator.add("ccc");
//
//        System.out.println(linkedList);
//    }
//}
//
package LinkedListOrdered;

public class LinkedListt {

    public static void main(String[] args) {
        int i = 0;
        
        LinkedListOrdered<String> linked = new LinkedListOrdered();

        String[] makanan = {"Lumpia", "Semarang", "Rabu", "Lumpia", "Rabu"};
//        String[] makanan = {"Risoles", "Ayam Geprek", "Mie Ayam", "Bakso Mercon", "Sate", "Sate Ayam", "Ayam Geprek", "Risoles"};
        System.out.print("Asli : [");
        while(i < makanan.length){
            System.out.print(makanan[i] + ", ");
            linked.addSort(makanan[i]);
            i++;
        }
        System.out.println("]");
        System.out.println("LinkedListOrderedUnique : " + linked.toString() + "\n");
        
        i=0;
        LinkedListOrdered<Integer> linked2 = new LinkedListOrdered();
        int[] angka = {1,5,100,2,9,4,2,1,10,2,40};
        System.out.print("Asli : [");
        while(i < angka.length){
            System.out.print(angka[i] + ", ");
            linked2.addSort(angka[i]);
            i++;
        }
        System.out.println("]");
        System.out.println("LinkedListOrderedUnique : " + linked2.toString() + "\n");
        

    }
}
