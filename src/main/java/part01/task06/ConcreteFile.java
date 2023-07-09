package part01.task06;

import java.io.FileWriter;
import java.io.IOException;

public class ConcreteFile extends AbstractFile{
    @Override
    public FileWriter createFileWriter() {
        try {
            FileWriter fileWriter = new FileWriter("file.txt");
            return fileWriter;
        } catch (IOException e) {

            e.printStackTrace();
        }
        return null;

    }
}
