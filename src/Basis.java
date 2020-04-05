import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Basis {
    public static void main(String[] args) {

        //задаем путь и имя входного файла
        String pathToInputFile = "E:\\Java\\";
        String nameOfInputFile = "inputFile";

        System.out.println("Поместите файл под именем "+nameOfInputFile+", содержащий пример,  в каталог "+pathToInputFile+" и нажмите Enter");
        Scanner scanner = new Scanner(System.in);
        String preInputEnter = scanner.nextLine();

        ReadFromFile out = new ReadFromFile(pathToInputFile,nameOfInputFile);
        //out.setDirectoryToFile(pathToInputFile);
        //out.setFileName(nameOfInputFile);
        out.outPutWhatRead();
    }
}

