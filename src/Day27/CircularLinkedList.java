package Day27;


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

public class CircularLinkedList
{
    private int length;
    ListNode head;
    CircularLinkedList()
    {
        this.length = 0;
        this.head = null;
    }

    public int getLength()
    {
        return length;
    }

    public void insertFront(int data)
    {
        ListNode node = new ListNode(data);
        if(head == null)
        {
            head = node;
            node.next = head;
        }
        else
        {
            node.next = head;
            ListNode temp = head;
            while(temp.next!=head)
                temp = temp.next;
            temp.next = node;
            head = node;
        }
        this.length++;
    }

    public void insertMiddle(int data)
    {

    }

    public void insertLast(int data)
    {
        ListNode node = new ListNode(data);
        if(head == null)
        {
            head = node;
        }
        else
        {
            // Using Do while
            /*
            ListNode temp = head;
            do
            {
                temp = temp.next;
            } while(temp.next!=head);

            temp.next = node;
            */
            ListNode temp = head;

            while(temp.next!=head)
            {
                temp = temp.next;
            }
            temp.next = node;
        }
        node.next = head;
        this.length++;
    }

    public void printList()
    {
        if(head == null)
        {
            System.out.println("List is Empty... No items to print!");
            return;
        }
        ListNode temp = head;
        do
        {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        } while(temp!=head);
        System.out.println(temp.data+" (head)");
    }

}
