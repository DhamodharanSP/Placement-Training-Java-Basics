package LinkedListProblems.DesignStack;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LinkedListStack stack = new LinkedListStack();

        System.out.print("Enter Number of elements to push into stack: ");
        int n = in.nextInt();
        System.out.println("Enter "+n+" elements: ");
        for(int i=0;i<n;++i)
        {
            stack.push(in.nextInt());
        }
        stack.printStack();
        System.out.println("Stack Length: " + stack.getLength());

        System.out.println("After one pop()");
        int data = stack.pop();
        if(data!=-1)
            System.out.println(data+" is poped!");
        stack.printStack();
        System.out.println("Stack Length: " + stack.getLength());

        System.out.println("Stack Empty Status: "+ stack.isEmpty());


    }
}
