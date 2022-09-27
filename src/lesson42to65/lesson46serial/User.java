package lesson42to65.lesson46serial;

import java.io.Serializable;

public class User implements Serializable  {
     int lifeLevel;
    static int staticField;
    transient Sword sword = new Sword();
}
