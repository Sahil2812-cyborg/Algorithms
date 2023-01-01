import java.util.*;

class Node{
    int val;
    Node next = null;
    Node(int val){
        this.val = val;
    }
}

public class LinkdList {
    Node head;
    public void prepend(int val){
        if(head==null){
            head = new Node(val);
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(val);
        return;
    }

    public void traverse(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node current = head;
        while(current != null){
            System.out.print(current.val + "->");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
        return;
    }

    public void remove(int val){
        if(head == null){
            System.out.println("Not found");
            return;
        }
        if(head.val == val){
            head = head.next;
            return;
        }
        Node current = head;
        while(current.next != null){
            if(current.next.val == val){
                current.next = current.next.next;
            }
            current = current.next;
        }
        traverse();
    }

    public static void main(String[] args) {
        LinkdList list = new LinkdList();
        list.prepend(1);
        list.prepend(2);
        list.prepend(3);
        list.prepend(0);
        list.traverse();
        list.remove(3);
    }
}
