package polymorphism;

class Pegawai {
    protected String name;
    protected int basicSalary = 2500000;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void getSalary() {
        int result = basicSalary;
        System.out.println(getName() + " Mendapatkan gaji Rp." + result);
    }
}