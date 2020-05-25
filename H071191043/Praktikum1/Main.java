package prak;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n//class Rectangle");
        Rectangle rec = new Rectangle();
        rec.height = 15;
        rec.width = 10;
        System.out.println("Luas = " + rec.getArea());

        System.out.println("\n//class Person");
        Person eka = new Person();
        eka.setName("Eka Fitri Ramadani");
        eka.setAge(18);
        System.out.println("Name\t: " + eka.getName());
        System.out.println("Age\t: " + eka.getAge());
        System.out.println("Is Male\t: " + eka.isMale('P'));
    }
}