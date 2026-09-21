class Display {
    void show(String name) {
        System.out.println("Name: " + name);
    }

    void show(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void show(String name, int age, double marks) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Display obj = new Display();

        obj.show("Kushagra");

        System.out.println();

        obj.show("Kushagra", 22);

        System.out.println();

        obj.show("Kushagra", 22, 87.5);
    }
}