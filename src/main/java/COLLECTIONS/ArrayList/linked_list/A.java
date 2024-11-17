package COLLECTIONS.ArrayList.linked_list;

import java.util.LinkedList;

public class A {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(10);
        linkedList.addFirst(1);
        linkedList.add(20);
        linkedList.addLast(9999);
        linkedList.add(null);
        System.out.println(linkedList);
    }
}
