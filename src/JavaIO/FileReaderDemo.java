package JavaIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {

        System.out.println(System.getProperty("user.dir"));

        FileReader fr =new FileReader(System.getProperty("user.dir") + "/data/name.txt");

        int i;


        while((i=fr.read())!=-1)

            System.out.print((char) i);

        fr.close();
    }
}
