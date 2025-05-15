package Day26;

class ListNode
{
    int data;
    ListNode prev;
    ListNode next;
    ListNode(int data)
    {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList
{
    private  int length;
    ListNode head;
    ListNode tail;
    DoublyLinkedList()
    {
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

    public int getLength()
    {
        return length;
    }

    public void insertFirst(int data)
    {
        ListNode node = new ListNode(data);
        if(head == null)
        {
            head = node;
            tail = node;
        }
        else
        {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    public void insertLast(int data)
    {
        ListNode node = new ListNode(data);
        if(head == null)
        {
            head = node;
            tail = node;
        }
        else
        {
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
    }

    public void printList()
    {
        if(head == null)
        {
            System.out.println("Doubly Linked List is Empty... No items to print!");
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

    public void printList(int ch)
    {
        if(ch == -1)
        {
            if (tail == null) {
                System.out.println("Doubly Linked List is Empty... No items to print!");
                return;
            }
            ListNode temp = tail;
            System.out.print(temp.data);
            while (temp.prev != null) {
                System.out.print(" <- " + temp.prev.data);
                temp = temp.prev;
            }
        }
        else
            System.out.println("Invalid format!");
    }


}
