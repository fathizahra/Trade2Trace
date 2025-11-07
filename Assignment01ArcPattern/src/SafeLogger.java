class SafeLogger {
    private static volatile SafeLogger instance;

    private SafeLogger() {}

    public static SafeLogger getInstance() {
        if (instance == null) {
            synchronized (SafeLogger.class) {
                if (instance == null)
                    instance = new SafeLogger();
            }
        }
        return instance;
    }

    public void log(String msg) {
        System.out.println(msg);
    }
}
