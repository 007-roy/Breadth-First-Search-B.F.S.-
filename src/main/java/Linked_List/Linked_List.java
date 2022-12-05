package Linked_List;


public class Linked_List {
    Node head;

    static class Node{
        int value;
        Node next;
        Node(int d){
            value = d;
            next = null;
        }
    }

    public static void main(String[] args){
        Linked_List ll = new Linked_List();

        ll.head = new Node(12);
        Node second = new Node(24);
        Node third = new Node(36);

        ll.head.next = second;
        second.next = third;
        third.next = null;

        while(ll.head != null){
            System.out.println(ll.head.value + " ");
            ll.head = ll.head.next;
        }

    }

}
