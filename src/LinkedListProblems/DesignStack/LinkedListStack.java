package LinkedListProblems.DesignStack;

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

public class LinkedListStack
{
    private int length;
    ListNode top;

    LinkedListStack()
    {
        this.length = 0;
        this.top = null;
    }

    public int getLength()
    {
        return this.length;
    }

    public void push(int data)
    {
        ListNode node = new ListNode(data);
        if(top == null)
            this.top = node;
        else
        {
            node.setNext(top);
            this.top = node;
        }
        this.length++;
    }

    public int pop()
    {
        int data = -1;
        if(top == null)
        {
            System.out.println("Stack is Empty! Pop() is not possible!");
            return -1;
        }
        else
        {
            data = top.getData();
            this.top = top.getNext();
            this.length--;
        }
        return data;
    }

    public boolean isEmpty()
    {
        return top == null;
    }

    public void printStack()
    {
        if(top == null)
        {
            System.out.println("Stack is Empty... No elements to Print!");
            return;
        }
        ListNode temp = top;
        while(temp != null)
        {
            System.out.print(" |  "+ temp.getData() +"  | \n");
            System.out.println(" _________ ");
            temp = temp.getNext();
        }
    }
}
