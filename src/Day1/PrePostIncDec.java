package Day1;

public class PrePostIncDec
{
    public static void main(String[] args) {
        byte a = 125;
        a++;
        a++;
        System.out.println(a++);
        ++a;
        ++a;
        System.out.println(++a);
        a--;
        a = a++;
        a = a++;
        System.out.println(a);
        // a = a++ + ++a;  ->  Here, "+" is promoting "byte" to "int", so, the resultant "int" can't be stored in "byte" producing error.
        a =(byte) (a++ + ++a);
        System.out.println(a);


    }
}
