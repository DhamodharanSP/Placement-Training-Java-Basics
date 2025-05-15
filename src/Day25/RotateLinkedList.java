package Day25;

import java.util.Scanner;

public class RotateLinkedList
{
    public static ListNode rotateLinkedList(ListNode head, int n)
    {


        return head;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter elements to add in Linked List...  (or) Press -1 to stop getting input");

        LinkedList list = new LinkedList();
        while(true)
        {
            int num = in.nextInt();
            if(num == -1) break;
            list.add(num);
        }
        System.out.print("Enter Number of Rotations: ");
        int n = in.nextInt();
        System.out.println("\nOriginal Linked List...");
        list.printList();
        System.out.printf("\nLinked List after Rotataing %d times...",n);
        rotateLinkedList(list.head, n);
        list.printList();
    }
}
