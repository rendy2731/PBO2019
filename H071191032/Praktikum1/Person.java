public class Person {
    String name;
    int age;
    boolean isMale;

    // Person(String name) {
    //     this.name = name;
    // }

    // Person(String name, int age) {
    //     this(name);
    //     this.age = age;
    // }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }

    public String getGender() {
        return this.isMale ? "Male" : "Female";
    }
}