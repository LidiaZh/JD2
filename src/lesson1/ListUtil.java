package lesson1;

import java.util.Comparator;
import java.util.List;

class ListUtil {

    public static void sortedList(List<List<String>> arrListStr) {
        //создаем компоратор для стравнения строк
        final Comparator<List<String>> comparator = (pList1, pList2) -> {
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
    public static void printList(List<List<String>> arrListStr) {
        for (List<String> arr : arrListStr) {
            for (String m : arr) {
                System.out.print(" " + m);
            }
            System.out.println();
        }
    }
}
