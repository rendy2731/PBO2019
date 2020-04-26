package polymorphism;

class Staf extends Pegawai{
    private int presence;
    
    public void setPresence(int presence){
        this.presence = presence;
    }
    public int getPresence(){
        return this.presence;
    }
    @Override
    public void setName(String name){
        super.name = name;
    }
    @Override
    public String getName(){
        return super.name;
    }
    @Override
    public void getSalary(){
        int result = super.basicSalary + (50000 * getPresence());
        System.out.println(getName() + " Mendapatkan gaji Rp." + result);
    }
}