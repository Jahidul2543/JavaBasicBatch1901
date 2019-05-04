package JavaIO;

import java.io.*;

public class BufferReaderDemo {


    public static void main(String[] args) throws IOException {

        File fl = new File(System.getProperty("user.dir") + "/data/name.txt");

        FileReader fr = new FileReader(fl.getAbsoluteFile());

        BufferedReader bufferedReader = new BufferedReader(fr);

        int i;

        while ((i=bufferedReader.read())!=-1){

            System.out.print((char) i);

        }

    }


}
