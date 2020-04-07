import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Basis {
    public static void main(String[] args) throws FileNotFoundException {

        //задаем путь и имя входного файла
        String pathToInputFile = "E:\\Java\\";
        String nameOfInputFile = "inputFile";


        System.out.println("Поместите файл под именем " + nameOfInputFile + ", содержащий пример,  в каталог " + pathToInputFile + " и нажмите Enter");
        Scanner scanner = new Scanner(System.in);
        String preInputEnter = scanner.nextLine();
        scanner.close();


       ReadFromFile lineFromFile = new ReadFromFile(pathToInputFile, nameOfInputFile);
      // String gettedLine = lineFromFile.getLine();


        System.out.println("То, что прочитано из файла: "+lineFromFile.getLineFromFile());

       // System.out.println("DirFrFi: "+lineFromFile.getDirectoryToFile());
        //System.out.println("Name File: "+lineFromFile.getFileName());
        //System.out.println("File "+lineFromFile.getFile());

        /*
        String path = pathToInputFile + nameOfInputFile;
        File file = new File(path);

        Scanner scanner1 = new Scanner(file);
        String line = scanner1.nextLine();
        scanner1.close();
        System.out.println("То, что прочитано из файла: " + line);
        */
    }



}




