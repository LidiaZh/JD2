package lesson1;

import java.io.*;
import java.util.ArrayList;

public class FileMethod {

    //чтение из файла
    public static void readInFile(String file1, ArrayList<ArrayList<String>> arrListStr) {
        try (final BufferedReader fileIn = new BufferedReader(new FileReader(file1))) {
            StringBuilder st = new StringBuilder(); //строка(слово) до знака табуляции
            ArrayList<String> arrListCol = new ArrayList<>(); //строка списка до абзаца
            int c;
            boolean paragraph;
            boolean tab;
            while ((c = fileIn.read()) != -1) {
                paragraph = Character.toString(c).equals("\n");
                tab = Character.toString(c).equals("\t");
                //проверка на табуляцию и абзац
                if (!tab && !paragraph) {
                    st.append((char) c); //накапливаем строку(слово) до табуляции или абзаца
                } else {
                    arrListCol.add(String.valueOf(st)); //накапливаем строку до абзаца
                    if (paragraph) {
                        arrListStr.add(arrListCol); //запись строки в список
                        arrListCol = new ArrayList<>(); //обнуляем строку до абзаца
                    }
                    st = new StringBuilder(); //обнуляем строку(слово)
                }
            }
            st.append("\r"); //перевод каретки на случай, если нет абзаца в конце
            //запись последних строк на случай, если нет азаца в конце
            arrListCol.add(String.valueOf(st));
            arrListStr.add(arrListCol);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //запись в файл
    public static void writeOutFile(String file2, ArrayList<ArrayList<String>> arrListStr) {
        try (BufferedWriter fileOut = new BufferedWriter(new FileWriter(file2))) {
            for (ArrayList<String> arr : arrListStr) {
                for (String m : arr) {
                    fileOut.write(m);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
