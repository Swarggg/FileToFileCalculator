import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

    private String directoryToFile;  // = "E:\\Java\\";
    private String fileName;  // = "inputFile";

    //конструктор класса
    public ReadFromFile (String directoryToFile, String fileName) {
        this.directoryToFile = directoryToFile;
        this.fileName = fileName;
    }

    /*
    //setters
    public void setFileName (String fileName) {
        this.fileName=fileName;
    }
    public void setDirectoryToFile (String directoryToFile) {
        this.directoryToFile=directoryToFile;
    }
    */

    File file = new File(directoryToFile+fileName);

    Scanner scanner;
    //обработка исключений
    {
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    String line = scanner != null ? scanner.nextLine() : null;


    public void outPutWhatRead () {
        System.out.println("То, что прочитано из файла: "+line);
    }
}
