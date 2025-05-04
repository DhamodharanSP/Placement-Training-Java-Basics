package LinkedListProblems.DesignQueue;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LinkedListQueue queue = new LinkedListQueue();

        System.out.print("Enter number of elements to Enque: ");
        int n = in.nextInt();
        System.out.println("Enter "+n+" elements: ");
        for(int i=0;i<n;++i)
        {
            queue.enque(in.nextInt());
        }
        queue.printQueue();
        System.out.println("Queue Length: "+queue.getLength());

        System.out.println("Queue After deque()");
        int data = queue.deque();
        if(data != -1)
            System.out.println(data+" is Dequed!");
        queue.printQueue();
        System.out.println("Queue Length: "+queue.getLength());
        System.out.println("Queue Empty Status: "+queue.isEmpty());

    }
}
