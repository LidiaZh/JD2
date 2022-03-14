package lesson2.ex2_3;

public class MethodSet {

    @AcademyInfo(year = "2022")
    public static void methodWithAnnotation() {
        System.out.println("Метод помечен аннотацией ");
    }

    public static void methodWithoutAnnotation() {
        System.out.println("Метод без аннотацией ");
    }

}
