package lesson1;

import java.util.*;

public class FileMain {
    public static void main(String[] args) {
        final String fileIn = "in.txt";
        final String fileOut = "out.txt";
        //создаем двухуровневый список
        List<List<String>> arrListStr = new ArrayList<>();

        //чтение из файла и запись данных в список
        FileUtils.readInFile(fileIn, arrListStr);

        //вывод значений списка, полученных из файла
        ListUtil.printList(arrListStr);

        //сортировка списка
        ListUtil.sortedList(arrListStr);
        System.out.println();
        //вывод отсортированного списка на экран
        ListUtil.printList(arrListStr);

        //запись в файл
        FileUtils.writeOutFile(fileOut, arrListStr);
    }
}

