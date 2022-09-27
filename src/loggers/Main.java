package loggers;

import java.io.IOException;
import java.util.logging.*;

public class Main {
    private static final Logger LOGER = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("java.util.logging.config.file"));

        //LOGER.log(Level.SEVERE, "Server", new Throwable());
        LOGER.log(Level.FINER,"Finer");
        Handler handler = new ConsoleHandler();
        handler.setFormatter(new MyFormatter());
        Handler handler1 = new FileHandler();
        handler1.setFilter(new MyFilter());
        LOGER.addHandler(handler);
        LOGER.info("fedor");
        LOGER.info("leroi");

    }
    static class MyFilter implements Filter{
        @Override
        public boolean isLoggable(LogRecord record) {
            return record.getMessage().endsWith("fedor");

        }
    }
    static class MyFormatter extends Formatter{
        @Override
        public String format(LogRecord record) {
            return record.getLevel() + record.getMessage();
        }
    }
}
