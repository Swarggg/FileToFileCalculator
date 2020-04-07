import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Basis {
    public static void main(String[] args) throws FileNotFoundException {

        //задаем путь и имя входного файла
        String pathToInputFile = "E:\\Java\\";
        String nameOfInputFile = "inputFile.txt";

        //информационное сообщение после запуска программы
        System.out.println("Поместите файл под именем " + nameOfInputFile + ", содержащий пример,  в каталог " + pathToInputFile + " и нажмите Enter");

        /* //Задержка перед чтением из файла
        Scanner scanner = new Scanner(System.in);
        String preInputEnter = scanner.nextLine();
        scanner.close();
         */

        //создаем объект класс ReadFromFile
        ReadFromFile lineFromFile = new ReadFromFile(pathToInputFile, nameOfInputFile);

        //выводим результат работы метода getLineFromFile объекта lineFromFile
        System.out.println("То, что прочитано из файла: "+lineFromFile.getLineFromFile());

    }



}




