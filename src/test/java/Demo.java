import java.util.Base64;

@FunctionalInterface
interface Printable{
    public void print();
    public static void print3D() {
        System.out.println("3D Printing");
    }
}


public class Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        // Referring to a non-functional method
        Printable p = demo::printColor;
        // calling abstract method
        p.print();
        String originalInput = "test input";
        System.out.println(Base64.getUrlEncoder().encodeToString(originalInput.getBytes()));
    }

    // Implementation of print() abstract method
    public void printColor() {
        System.out.println("Color Printing...");
    }
}