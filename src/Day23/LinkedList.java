package Day23;

import java.util.List;

class ListNode
{
    private int data;
    private ListNode next;
    ListNode(int data)
    {
        this.data = data;
        this.next = null;
    }
    public void setData(int data)
    {
        this.data = data;
    }
    public int getData()
    {
        return this.data;
    }
    public void setNext(ListNode next)
    {
        this.next = next;
    }
    public ListNode getNext()
    {
        return this.next;
    }
}

public class LinkedList
{
    private int length;
    private ListNode head;

    LinkedList()
    {
        this.length = 0;
    }

    public int getLength()
    {
        return this.length;
    }

    public void insertFirst(int data)
    {
        ListNode node = new ListNode(data);
        if(head == null)
            this.head = node;
        else
        {
           node.setNext(head);
           this.head = node;
        }
        this.length++;
    }

    public void insertMiddle(int data, int pos)
    {
        ListNode node = new ListNode(data);
        if(pos <= 0 || pos > length)
        {
            System.out.println("Invalid position!");
        }
        else
        {
            ListNode temp = head;
            int c = 1;
            while(c < pos-1)
            {
                temp = temp.getNext();
                c++;
            }
            node.setNext(temp.getNext());
            temp.setNext(node);
            this.length++;
        }
    }

    public void insertLast(int data)
    {
        ListNode node = new ListNode(data);
        if(head == null)
            this.head = node;
        else
        {
            ListNode temp = head;
            while(temp.getNext() != null)
            {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
        this.length++;
    }

    public int deleteFirst()
    {
        int data = -1;
        if(head == null)
            System.out.println("Linked List is Empty... Deletion not possible!");
        else
        {
            data = head.getData();
            head = head.getNext();
            this.length--;
        }
        return data;
    }

    public boolean isEmpty()
    {
        return head==null;
    }

    public void printLinkedList()
    {
        if(head==null)
        {
            System.out.println("Linked list is Empty... Nothing to Print!");
            return;
        }
        ListNode temp = head;
        while(temp.getNext()!=null)
        {
            System.out.print(temp.getData()+" -> ");
            temp = temp.getNext();
        }

        System.out.println(temp.getData());
    }
}
