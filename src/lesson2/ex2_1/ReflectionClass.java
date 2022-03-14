package lesson2.ex2_1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class ReflectionClass {
    void getClassInformation(Object objectNam) {

        System.out.print("Информафция о классе: ");
        Class<?> classInf = objectNam.getClass();
        System.out.println(classInf);

        System.out.println("Информация о пакете: " + classInf.getPackageName());
        System.out.println("Имя класса: " + classInf.getSimpleName());
        System.out.println("Информация о суперклассе: " + classInf.getSuperclass());

        System.out.print("Модификатор доступа: ");
        int mods = classInf.getModifiers();
        System.out.println(ReflectionClass.modif(mods));

        System.out.println("\nИнформация о полях класса:");
        Field[] publicField = classInf.getDeclaredFields();
        for (Field field : publicField) {
            Class<?> fieldType = field.getType();
            System.out.printf("name: %10s | type: %20s |\n", field.getName(), fieldType.getName());
        }

        System.out.println("\nИнформация о конструкторах: ");
        Constructor<?>[] constructors = classInf.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("Конструктор: " + constructor.getName());
            Class<?>[] paramTypes = constructor.getParameterTypes();
            for (Class<?> paramType : paramTypes) {
                System.out.println(paramType.getName() + " ");
            }
            System.out.println();
        }

        System.out.println("Информация о методах: ");
        Method[] methods = classInf.getDeclaredMethods();
        for (Method method : methods) {
            System.out.printf("name: %12s | modifier: %10s | return type: %10s | ",
                    method.getName(), ReflectionClass.modif(method.getModifiers()), method.getReturnType().getSimpleName());
            Class<?>[] params = method.getParameterTypes();
            System.out.print(" parameters: ");
            for (Class<?> param : params) {
                System.out.printf("%20s ", param.getName());
            }
            System.out.println();
        }
    }

    private static String modif(int mods) {
        String str = null;
        if (Modifier.isAbstract(mods)) {
            str = "abstract";
        }
        if (Modifier.isFinal(mods)) {
            str = "final";
        }
        if (Modifier.isPublic(mods)) {
            str = "public";
        }
        if (Modifier.isProtected(mods)) {
            str = "protected";
        }
        if (Modifier.isStatic(mods)) {
            str = "static";
        }
        if (Modifier.isPrivate(mods)) {
            str = "privat";
        }
        return str;
    }
}
