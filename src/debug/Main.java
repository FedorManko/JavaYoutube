package debug;

import java.util.Date;
import java.util.Random;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger("My");
    public static void main(String[] args) {
        int i = 5;
        System.out.println(i);
        LOGGER.info("Message");
        Car car = new Car();
        System.out.println(car.run(10,30));
        Random random = new Random(){
            @Override
            public double nextDouble() {
                double d =  super.nextDouble();
                System.out.println(d);
                return d;
            }
        };
        random.nextDouble();
        Date date = new Date();

    }
}
