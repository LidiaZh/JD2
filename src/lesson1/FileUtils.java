package lesson1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

    //чтение из файла
    public static void readInFile(String file, List<List<String>> arrListStr) {
        final String PARAGRAPH = "\n";
        final String TAB = "\t";
        final String CARRIAGE = "\r";
        try (final BufferedReader fileIn = new BufferedReader(new FileReader(file))) {
            StringBuilder st = new StringBuilder(); //строка(слово) до знака табуляции
            List<String> arrListCol = new ArrayList<>(); //строка списка до абзаца
            int c;
            boolean paragraph;
            boolean tab;
            while ((c = fileIn.read()) != -1) {
                paragraph = PARAGRAPH.equals(Character.toString(c));
                tab = TAB.equals(Character.toString(c));
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
            st.append(CARRIAGE); //перевод каретки на случай, если нет абзаца в конце
            //запись последних строк на случай, если нет азаца в конце
            arrListCol.add(String.valueOf(st));
            arrListStr.add(arrListCol);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //запись в файл
    public static void writeOutFile(String file, List<List<String>> arrListStr) {
        try (BufferedWriter fileOut = new BufferedWriter(new FileWriter(file))) {
            for (List<String> arr : arrListStr) {
                for (String m : arr) {
                    fileOut.write(m);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
