package task05;

import java.io.FileReader;
import java.io.IOException;

public class Text extends Reader{


    @Override
    public void textReader() {

        try {
            FileReader fr = new FileReader("File.txt");

        } catch (IOException e) {
            e.printStackTrace();


        }

    }

}
