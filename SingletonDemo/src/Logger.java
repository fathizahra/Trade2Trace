// SingletonDemo.java
import java.time.LocalDateTime;

// Logger class using the Singleton Pattern
class Logger {
    // Step 1: Create a private static variable to hold the single instance
    private static Logger instance;

    // Step 2: Make the constructor private so no one can create another instance
    private Logger() { }

    // Step 3: Provide a public static method to get the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();   // Create only once (lazy initialization)
        }
        return instance;
    }

    // Step 4: Create a method to log messages with timestamps
    public void log(String message) {
        System.out.println(LocalDateTime.now() + " - " + message);
    }
}

