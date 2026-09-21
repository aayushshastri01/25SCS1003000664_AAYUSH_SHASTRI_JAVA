public class UnboxingDemo {
    public static void main(String[] args) {

        Integer obj1 = 100;
        Double obj2 = 25.5;
        Character obj3 = 'A';
        Boolean obj4 = true;

        // Unboxing
        int number = obj1;
        double decimal = obj2;
        char letter = obj3;
        boolean status = obj4;

        // Display converted values
        System.out.println("int value: " + number);
        System.out.println("double value: " + decimal);
        System.out.println("char value: " + letter);
        System.out.println("boolean value: " + status);
    }
}