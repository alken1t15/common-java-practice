package PatternTask.Chain;

public class Main {
    public static void main(String[] args) {
        SmsLogger smsLogger = new SmsLogger(Level.ERROR);
        FileLogger fileLogger = new FileLogger(Level.DEBUG);
        EmailLogger emailLogger = new EmailLogger(Level.INFO);
        smsLogger.setNext(fileLogger);
        fileLogger.setNext(emailLogger);

        smsLogger.writeMessage("Все хорошо",Level.INFO);
        smsLogger.writeMessage("Идет режим отладки",Level.DEBUG);
        smsLogger.writeMessage("Система упала",Level.ERROR);
    }
}
