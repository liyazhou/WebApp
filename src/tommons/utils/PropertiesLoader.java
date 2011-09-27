package tommons.utils;

import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {

    private static final String PROPERTIES_FILE = "application.properties";
    private static final Properties properties;

    static {
        properties = new Properties();
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        try {
            System.out.println("Populated Properties from " + PROPERTIES_FILE);
            properties.load(classLoader.getResourceAsStream(PROPERTIES_FILE));
        } catch (IOException e) {
            System.err.println("Error loading " + PROPERTIES_FILE + e);
        }
    }

    public static Properties loadProperties() {
        return properties;
    }

    public static void main(String[] args) {
        Properties props1 = PropertiesLoader.loadProperties();
        for (Object key : props1.keySet()) {
            System.out.println(key + " = " + props1.get(key));
        }

        // Should not reload .properties file for second time. Just dump existing Properties.
        Properties props2 = PropertiesLoader.loadProperties();
        for (Object key : props2.keySet()) {
            System.out.println(key + " = " + props2.get(key));
        }
    }
}
