package preferences;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

public class Main {
    public static void main(String[] args) throws IOException, BackingStoreException {
        Preferences preferences = Preferences.systemRoot();
        Preferences preferences1 = Preferences.userRoot();
        preferences1.put("key", "value");
        System.out.println(preferences1.get("key","default"));
        preferences1.exportSubtree(new FileOutputStream("myPref.xml"));
    }
}
