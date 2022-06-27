package lesson2.ex2_1;

public class Man {
    public String name;
    private String lastname;
    private int high;
    private int age;

    public Man(String name, String lastname, int high, int age) {
        String hobby = "tennis";
        this.name = name;
        this.lastname = lastname;
        this.high = high;
        this.age = age;
    }

    public Man() {
        this.name = "Misha";
        this.age = 12;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, String mm) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    private static void testCheck(int number) {
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
