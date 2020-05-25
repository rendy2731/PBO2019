package polymorphism;

class Dosen extends Pegawai{
    private int sks;

    public void setSks(int sks){
        this.sks = sks;
    }
    public int getSks(){
        return this.sks;
    }
    @Override
    public String getName(){
        return super.name;
    }
    @Override
    public void setName(String name){
        super.name = name;
    }
    @Override
    public void getSalary(){
        int result = super.basicSalary  + (120000 *getSks());
        System.out.println(getName() + " Mendapatkan gaji Rp." + result);
    }
}