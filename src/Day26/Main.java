package Day26;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        DoublyLinkedList list = new DoublyLinkedList();

        System.out.println("Enter elements to append the Doubly linked list... (or) Press -1 to stop getting input!");

        while(true)
        {
            int n = in.nextInt();
            if(n==-1) break;
            list.insertLast(n);
        }
        list.printList();
        list.printList(-1);
    }
}
