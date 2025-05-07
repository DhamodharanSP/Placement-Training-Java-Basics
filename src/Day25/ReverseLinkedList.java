package Day25;

import java.util.Scanner;


public class ReverseLinkedList
{
    public static ListNode reverseLinkedList(ListNode head)
    {
        if(head == null || head.next == null)
            return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;
        while(next!=null)
        {
            if(prev == null)
                curr.next = null;
            else
                curr.next = prev;
            prev = curr;
            curr = next;
            next = curr.next;
        }
        curr.next = prev;
        return curr;
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
        list.printList();
        System.out.println("\nLinked List after Reversing...");
        list.head = reverseLinkedList(list.head);
        list.printList();

    }
}
