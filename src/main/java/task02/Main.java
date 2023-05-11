package task02;

public class Main {
    public static void main(String[] args) {

        String fileName = "filename.exe";
        int dotIndex = fileName.lastIndexOf(".");
        String name = fileName.substring(0,dotIndex);
        String extension = fileName.substring(dotIndex +1);
        System.out.println("File name: " + name);
        System.out.println("File extension: " + extension);
    }
}
