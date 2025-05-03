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
        */

        //Insert at Middle
        /*
        System.out.println("Enter element & it's position to insert: ");
        System.out.print("Element: ");
        int data = in.nextInt();
        System.out.print("Position: ");
        int pos = in.nextInt();

        list.insertMiddle(data, pos);
        list.printLinkedList();*/

    }
}
