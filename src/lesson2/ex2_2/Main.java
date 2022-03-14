package lesson2.ex2_2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        HelloWorld helloWorld = new HelloWorld();
        try {
            Method method = helloWorld.getClass().getDeclaredMethod("printHelloWorld");
            method.invoke(helloWorld);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException ex) {
            ex.printStackTrace();
        }

    }
}
