package Day23;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LinkedList list = new LinkedList();

        System.out.print("Enter number elements to add in a linked list: ");
        int n = in.nextInt();

        for(int i=0;i<n;++i)
            list.insertLast(in.nextInt()); // Insert at Last
        list.printLinkedList();

        //Insert at Front
        /*
        System.out.print("Enter element to insert at front: ");
        list.insertFirst(in.nextInt());
        list.printLinkedList();
        */

        //Insert at Middle
        /*
        System.out.println("Enter element & it's position to insert: ");
        System.out.print("Element: ");
        int data = in.nextInt();
        System.out.print("Position: ");
        int pos = in.nextInt();

        list.insertMiddle(data, pos);
        list.printLinkedList();
        */

        //Delete First Node
        /*
        int data = list.deleteFirst();
        if(data!=-1)
            System.out.println(data+" is deleted!");
        list.printLinkedList();
        */

        //Delete Last Node
        /*
        int data = list.deleteLast();
        if(data!=-1)
            System.out.println(data+" is deleted!");
        list.printLinkedList();
        */

        //Delete Middle Node
        /*
        System.out.print("Enter a position to delete: ");
        int pos = in.nextInt();
        int data = list.deleteMiddle(pos);
        if(data!=-1)
            System.out.println(data+" is deleted!");
        list.printLinkedList();
        */

        System.out.println("Linked List Empty status: "+list.isEmpty());

        System.out.println("Linked List Length: "+list.getLength());

    }
}
