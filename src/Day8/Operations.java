package Day8;

public class Operations
{
    public static void main(String[] args) {
        String a = "Dhamo";
        String b = "Dhamo";
        String c = new String("Dhamo");
        String d = new String("Dhamo");
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(c==d);

        // intern() will make the value in the heap (created using 'new' keyword) to be inserted in the String constant pool
        String e = d.intern();
        System.out.println(e == a);
        System.out.println(e == d);

        // to overcome all these problems, use ".equals()"

        System.out.println("Using .equals()");
        System.out.println(a.equals(b));
        System.out.println();
    }
}
