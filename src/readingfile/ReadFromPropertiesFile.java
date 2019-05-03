package readingfile;

import Quiz.inheritance.PreNokia1100;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadFromPropertiesFile {

    public static void main(String[] args) throws IOException {

        InputStream inputStream = new FileInputStream("../JavaBasicBatch1901/data/data.properties");

        Properties properties = new Properties();

        properties.load(inputStream);
        String url = properties.getProperty("url");
        System.out.println(url);

        String name = properties.getProperty("name");

        System.out.println(name);

    }


}
