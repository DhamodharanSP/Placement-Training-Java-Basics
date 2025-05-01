package Day22.Problem2;

import java.util.Scanner;

public interface Food
{
    public void eat();
}

class Veg implements Food
{
    String food;
    double amt;
    Veg(String food, double amt)
    {
        this.food = food;
        this.amt = amt;
    }
    public void eat()
    {
        System.out.println("Veggies....");
        System.out.println("Food: "+this.food);
        System.out.println("Amount: $"+this.amt);
    }
}

class NonVeg implements Food
{
    String food;
    double amt;
    NonVeg(String food, double amt)
    {
        this.food = food;
        this.amt = amt;
    }
    public void eat()
    {
        System.out.println("Non Veg....");
        System.out.println("Food: "+this.food);
        System.out.println("Amount: $"+this.amt);
    }
}

class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter type of food you want [ Veg | NonVeg ] : ");
        String type = in.nextLine().toLowerCase();

        System.out.println("Enter the dish: ");
        String dish = in.nextLine();

        System.out.println("Enter the Amount: ");
        double amount = in.nextDouble();

        Food food;

        if(type.equals("veg"))
        {
            food = new Veg(dish, amount);
            food.eat();
        }
        else if(type.equals("nonveg"))
        {
            food = new NonVeg(dish, amount);
            food.eat();
        }
        else System.out.println("Invalid food type!");
    }
}