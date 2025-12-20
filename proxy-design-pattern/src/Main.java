public class Main {
    public static void main(String[] args) {

        Image image = new ProxyImage("photo.jpg");

        // Image will be loaded only when display() is called
        System.out.println("First call:");
        image.display();

        System.out.println("\nSecond call:");
        image.display();
    }
}