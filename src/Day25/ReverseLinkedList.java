package Day25;

import java.util.List;
import java.util.Scanner;

class ListNode
{
    int data;
    ListNode next;
    ListNode(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class LinkedList
{
    private int length;
    ListNode head;
    LinkedList()
    {
        this.length = 0;
        this.head = null;
    }

    public int getLength()
    {
        return length;
    }

    public void add(int data)
    {
        ListNode node = new ListNode(data);
        if(head == null)
            head = node;
        else
        {
            ListNode temp = head;
            while(temp.next!=null)
                temp = temp.next;
            temp.next = node;
        }
        this.length++;
    }

    public void printList()
    {
        if(head == null)
        {
            System.out.println("Linked List is Empty... No elements to print!");
            return;
        }
        ListNode temp = head;
        while(temp.next!=null)
        {
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}

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
