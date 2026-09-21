public class AutoboxingDemo {
    public static void main(String[] args) {

        int number = 100;
        double decimal = 25.5;
        char letter = 'A';
        boolean status = true;

        // Autoboxing
        Integer obj1 = number;
        Double obj2 = decimal;
        Character obj3 = letter;
        Boolean obj4 = status;

        // Display values
        System.out.println("Integer object: " + obj1);
        System.out.println("Double object: " + obj2);
        System.out.println("Character object: " + obj3);
        System.out.println("Boolean object: " + obj4);
    }
}