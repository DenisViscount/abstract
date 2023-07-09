package part01.task02;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
      try {
          reader();
      }
        catch (IOException ex){
            System.out.println("File not found " + ex.getMessage());
        }

    }

    public static void reader() throws IOException{

            FileReader fl = new FileReader("Text.txt");
            fl.close();




    }
}
