package Day25;

import java.util.Scanner;

public class MergeTwoUnsortedListToFormSortedList
{
    public static ListNode insertInOrder(ListNode head, ListNode node)
    {
        if(head==null)
        {
            head = node;
        }
        else
        {
            if(node.data <= head.data)
            {
                node.next = head;
                head = node;
            }
            else
            {
                ListNode temp = head;
                while(temp.next != null)
                {
                    if(node.data < temp.next.data)
                    {
                        node.next = temp.next;
                        temp.next = node;
                        return head;
                    }
                    temp = temp.next;
                }
                temp.next = node;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Sorted list 1
        System.out.println("Enter elements to add in Linked List - 1...  (or) Press -1 to stop getting input");

        ListNode h1 = null;
        while(true)
        {
            int num = in.nextInt();
            if(num == -1) break;
            ListNode node = new ListNode(num);
            h1 = insertInOrder(h1, node);
        }
        LinkedList l1 = new LinkedList(h1);
        l1.printList();

        //Sorted list 2
        System.out.println("\nEnter elements to add in Linked List - 2...  (or) Press -1 to stop getting input");

        ListNode h2 = null;
        while(true)
        {
            int num = in.nextInt();
            if(num == -1) break;
            ListNode node = new ListNode(num);
            h2 = insertInOrder(h2, node);
        }
        LinkedList l2 = new LinkedList(h2);
        l2.printList();

        // Final Sorted list
        System.out.println("\nResultant Sorted List after merging Two Unsorted list...");

        // This is optimized by just adding elements of list 2 at the end the list 1
        ListNode sortedResult = h1;

        ListNode temp2 = h2;
        while(temp2!=null)
        {
            ListNode node = new ListNode(temp2.data);
            sortedResult = insertInOrder(sortedResult, node);
            temp2 = temp2.next;
        }
        LinkedList res = new LinkedList(sortedResult);
        res.printList();

    }
}

//5 2 1 34 23 89 2 5 -1
//34 56 78 0 0 2 34 1 2 1 -1
