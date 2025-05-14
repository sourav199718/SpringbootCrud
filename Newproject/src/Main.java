// Superclass
public class Main {
    int z;

    public void addition(int a, int b) {
        z = a + b;
        System.out.println("The sum of a and b is " + z);
    }

    public void subtraction(int a, int b) {
        z = a - b;
        System.out.println("The difference of a and b is " + z);
    }
}

// Subclass in a separate file or after Main class
class mycalculation extends Main {
    public void multiplication(int a, int b) {
        z = a * b;
        System.out.println("The product of a and b is " + z);
    }

    public static void main(String[] args) {
        mycalculation obj = new mycalculation();
        obj.addition(5, 4);       // Output: 9
        obj.subtraction(5, 4);    // Output: 1
        obj.multiplication(5, 4); // Output: 20
    }
}
