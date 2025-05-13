package Day25;

import java.util.Scanner;

public class RemoveNthNode
{
    public static ListNode removeNlast(ListNode head, int n)
    {
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        while(ptr1!=null && n-- > 0)
        {
            ptr1 = ptr1.next;
        }
        if(ptr1 == null)
        {
            head = head.next;
            return head;
        }
        while(ptr1.next!=null)
        {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        ptr2.next = ptr2.next.next;
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
        list.printList();

        System.out.print("Enter to remove n'th node from last: ");
        int n = in.nextInt();

        if(n>0 && n<=list.getLength())
            list.head = removeNlast(list.head, n);
        else System.out.println("Invalid Position... ");
        list.printList();
    }
}
