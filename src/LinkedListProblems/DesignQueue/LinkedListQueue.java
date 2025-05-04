package LinkedListProblems.DesignQueue;

class ListNode
{
    private int data;
    ListNode next;

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

public class LinkedListQueue
{
    private int length;
    ListNode front;
    ListNode rear;

    LinkedListQueue()
    {
        this.length = 0;
        this.front = null;
        this.rear = null;
    }

    public int getLength()
    {
        return this.length;
    }

    public void enque(int data)
    {
        ListNode node = new ListNode(data);
        if(front == null)
        {
            this.front = node;
            this.rear = node;
        }
        else
        {
            rear.setNext(node);
            this.rear = node;
        }
        this.length++;
    }

    public int deque()
    {
        int data = -1;
        if(front == null)
        {
            System.out.println("Queue is Empty... Deque not possible");
        }
        else
        {
            data = front.getData();
            front = front.getNext();
            this.length--;
        }
        return data;
    }

    public boolean isEmpty()
    {
        return front==null;
    }

    public void printQueue()
    {
        if(front == null)
        {
            System.out.println("Queue is Empty... No elements to Print!");
        }
        else
        {
            ListNode temp = front;
            while(temp.getNext()!=null)
            {
                System.out.print(temp.getData()+" : ");
                temp = temp.getNext();
            }
            System.out.println(temp.getData());
        }
    }
}
