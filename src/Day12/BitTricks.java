package Day12;

public class BitTricks
{
    public static void main(String[] args) {
        int x = 2366;

        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(x-1));

        x &= (x-1);
        System.out.println(x);

        int a = 14;
        System.out.println( a & -a);

        //
    }
}
