package Day22.Problem1;

import java.util.Scanner;

public interface Playable
{
    public void play();
}

class Guitar implements Playable
{
    public void play()
    {
        System.out.println("Guitar is playing: Tan tan tan...");
    }
}

class Piano implements Playable
{
    public void play()
    {
        System.out.println("Piano is playing: Hmmm Hmmm tommm tummmmm");
    }
}

class Main
{
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        System.out.println("Enter the Instrument to play [ Guitar | Piano ] : ");
        String instrument = in.next().toLowerCase();

        Playable play;

        if(instrument.equals("guitar"))
        {
            play = new Guitar();
            play.play();
        }
        else if(instrument.equals("piano"))
        {
            play = new Piano();
            play.play();
        }
        else System.out.println("You entered a wrong Instrument!");

    }
}