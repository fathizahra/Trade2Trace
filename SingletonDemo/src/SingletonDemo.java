
public class SingletonDemo {
    public static void main(String[] args) {
        // Get Logger instances using getInstance()
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Log messages
        logger1.log("Program started.");
        logger2.log("Performing task...");

        // Demonstrate that both references point to the same instance
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the same instance.");
        } else {
            System.out.println("Different instances (not a singleton).");
        }
    }
}
