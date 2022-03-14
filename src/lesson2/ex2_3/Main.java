package lesson2.ex2_3;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args){

        MethodSet methodSet = new MethodSet();

        Method[] methods = methodSet.getClass().getDeclaredMethods();
        for (Method method : methods) {
            System.out.printf("name: %25s | annotation: %40s |\n",
                    method.getName(), method.getAnnotation(AcademyInfo.class));
        }
    }
}
