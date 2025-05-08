package Day27;

import Day23.LinkedList;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        CircularLinkedList list = new CircularLinkedList();

        System.out.println("Enter elements to add in a linked list... (or) Press -1 to stop taking input!");

        while(true)
        {
            int num = in.nextInt();
            if(num == -1) break;
            list.insertLast(num);// Insert at Last
        }
        list.printList();

        // Insert elements at front
        System.out.print("Enter element to add at front: ");
        int n = in.nextInt();
        list.insertFront(n);
        list.printList();
    }
}
