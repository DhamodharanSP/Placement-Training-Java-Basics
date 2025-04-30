package Day21;

import java.util.Random;
import java.util.Scanner;

class Rules
{
    protected int computeResult(String user, String computer)
    {
        if(user.equals(computer))
            return 0;
        else if((user.equals("rock") && computer.equals("scissor")) || (user.equals("paper") && computer.equals("rock")) || (user.equals("scissor") && computer.equals("paper")))
            return 1;
        else return -1;
    }
}

class PlayGame extends Rules
{
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    public void start()
    {
        char choice = '0';
        while(choice!='q')
        {
            System.out.println("---------------------------------Play Rock Paper Scissor---------------------------------");

            System.out.println("\nValid Moves -> Rock | Paper | Scissor");
            System.out.print("Enter your move: ");
            String user = in.next().toLowerCase();

            String[] moves = {"rock", "paper", "scissor"};

            boolean flag = false;
            for(String i:moves)
            {
                if(user.equals(i))
                    flag = true;
            }
            if(!flag)
            {
                System.out.println("Not a Valid move!");
                continue;
            }

            String computer = moves[random.nextInt(3)];

            System.out.println("Computer's move: " + computer);

            int res = computeResult(user, computer);

            if (res == 0) System.out.println("Draw!");
            else if (res == 1) System.out.println("User Wins!");
            else System.out.println("Computer Wins!");

            System.out.println("\nPress any key to play again (or) Press 'q' to Quit");
            choice = in.next().charAt(0);
        }

    }
}

public class RockPaperScissor
{
    public static void main(String[] args) {
        PlayGame game = new PlayGame();
        game.start();
    }
}
