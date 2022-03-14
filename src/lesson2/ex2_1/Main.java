package lesson2.ex2_1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        ReflectionClass reflection = new ReflectionClass();
        try {
            Class[] paramType = new Class[]{Object.class};
            Method method = reflection.getClass().getDeclaredMethod("getClassInformation", paramType);
            Object[] arg = new Object[]{new Man()};
            method.invoke(reflection, arg);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException ex) {
            ex.printStackTrace();
        }
    }
}
