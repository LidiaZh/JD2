package lesson1;

import java.util.*;

public class FileMain {
    public static void main(String[] args) {
        final String file1 = "in.txt";
        final String file2 = "out.txt";
        //создаем двухуровневый список
        ArrayList<ArrayList<String>> arrListStr = new ArrayList<>();

        //чтение из файла и запись данных в список
        FileMethod.readInFile(file1, arrListStr);

        //вывод значений списка, полученных из файла
        SortedList.printList(arrListStr);

        //сортировка списка
        SortedList.sortedList(arrListStr);
        System.out.println();
        //вывод отсортированного списка на экран
        SortedList.printList(arrListStr);

        //запись в файл
        FileMethod.writeOutFile(file2, arrListStr);
    }
}

