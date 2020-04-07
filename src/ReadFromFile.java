import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

        private String directoryToFile;  // = "E:\\Java\\";
        private String fileName;  // = "inputFile";
        private String line;

        //конструктор класса
        public ReadFromFile (String directoryToFile, String fileName) {
            this.directoryToFile = directoryToFile;
            this.fileName = fileName;
        }

        public String getLineFromFile  () throws FileNotFoundException {
            File file = new File(directoryToFile+fileName);
            Scanner scannerInR = new Scanner(file);
            this.line = scannerInR.nextLine();
            scannerInR.close();
            return this.line;
        }
}







