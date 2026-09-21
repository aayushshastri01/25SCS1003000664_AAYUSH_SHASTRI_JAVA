public class PrimitiveWrapper {
    public static void main(String[] args) {

        // Primitive variables
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40L;
        float f = 50.5f;
        double d = 60.5;
        char c = 'A';
        boolean bool = true;

        // Wrapper variables
        Byte wb = b;
        Short ws = s;
        Integer wi = i;
        Long wl = l;
        Float wf = f;
        Double wd = d;
        Character wc = c;
        Boolean wbool = bool;

        // Display primitive values
        System.out.println("Primitive Values:");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);

        // Display wrapper values
        System.out.println("\nWrapper Values:");
        System.out.println("Byte: " + wb);
        System.out.println("Short: " + ws);
        System.out.println("Integer: " + wi);
        System.out.println("Long: " + wl);
        System.out.println("Float: " + wf);
        System.out.println("Double: " + wd);
        System.out.println("Character: " + wc);
        System.out.println("Boolean: " + wbool);
    }
}