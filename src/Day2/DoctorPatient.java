package Day2;

import java.util.Scanner;

public class DoctorPatient
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int earning = 0;
//        while((a = in.nextInt()) !=-1)
//        {
//            if(a<17) earning += 200;
//            else if(a<40) earning += 300;
//            else earning += 500;
//        }
//        while(in.hasNext())
//        {
//            int a = in.nextInt();
//            if(a<17) earning += 200;
//            else if(a<40) earning += 300;
//            else earning += 500;
//        }
        String s = in.nextLine();
        String[] arr = s.split(" ");
        for(String i:arr)
        {
            int a = Integer.parseInt(i);
            if(a<17) earning += 200;
            else if(a<40) earning += 300;
            else earning += 500;
        }
        System.out.println(earning);
    }
}
