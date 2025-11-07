import java.time.LocalDateTime;

// Logger class using Singleton Pattern
class Logger {
    // Private static instance
    private static Logger instance;

    // Private constructor (no external creation)
    private Logger() {}

    // Public static method to get the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();  // Lazy initialization
        }
        return instance;
    }

    // Method to log timestamped messages
    public void log(String message) {
        System.out.println(LocalDateTime.now() + " - " + message);
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application started.");
        logger2.log("User logged in.");

        System.out.println("Are both logger instances same? " + (logger1 == logger2));
    }
}
