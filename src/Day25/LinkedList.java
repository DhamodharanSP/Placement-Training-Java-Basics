package Day25;

public class LinkedList
{
    private int length;
    ListNode head;
    LinkedList()
    {
        this.length = 0;
        this.head = null;
    }

    LinkedList(ListNode head)
    {
        this.head = head;
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
