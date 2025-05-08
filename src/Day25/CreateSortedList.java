package Day25;

import java.util.Scanner;

public class CreateSortedList
{
    public static ListNode addInOrder(ListNode head, ListNode node)
    {
        if(head == null)
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
                while(temp.next!=null)
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
        System.out.println("Enter elements to add in Linked List...  (or) Press -1 to stop getting input");

        ListNode head = null;
        while(true)
        {
            int num = in.nextInt();
            if(num == -1) break;
            ListNode node = new ListNode(num);
            head = addInOrder(head, node);
        }
        LinkedList list = new LinkedList(head);
        list.printList();


    }
}
