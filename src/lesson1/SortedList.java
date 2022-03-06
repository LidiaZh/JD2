package lesson1;

import java.util.ArrayList;
import java.util.Comparator;

class SortedList {

    public static void sortedList(ArrayList<ArrayList<String>> arrListStr) {
        //создаем компоратор для стравнения строк
        final Comparator<ArrayList<String>> comparator = (pList1, pList2) -> {
            for (int i = 0; i < arrListStr.get(0).size(); i++) {
                if (pList1.get(i).compareTo(pList2.get(i)) == 0) {
                    return pList1.get(++i).compareTo(pList2.get(++i));
                }
            }
            return pList1.get(0).compareTo(pList2.get(0));
        };
        //применияем сортировку к списку
        arrListStr.sort(comparator);
    }

    //вывод на экран
    public static void printList(ArrayList<ArrayList<String>> arrListStr) {
        for (ArrayList<String> arr : arrListStr) {
            for (String m : arr) {
                System.out.print(" " + m);
            }
            System.out.println();
        }
    }
}
