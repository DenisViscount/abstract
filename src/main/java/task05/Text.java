package task05;

import java.io.FileReader;
import java.io.IOException;

public class Text extends Reader{

    @Override
    public void textReader() {
        FileReader  fr = null;

        try {
            fr =  new FileReader("File.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (fr != null){
                    fr.close();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
