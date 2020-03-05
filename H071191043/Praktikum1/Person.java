package prak;

class Person {
    private String name;
    private int age;
    private boolean isMale;

    //method set
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    boolean isMale(char gender) {
        if (gender == 'L') return true;
        return false;
    }
    //method get
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
}