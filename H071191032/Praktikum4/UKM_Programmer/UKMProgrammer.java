import java.util.ArrayList;
import java.util.List;

public class UKMProgrammer {
    List<PengurusInti> listPengurusInti;
    List<Koordinator> listKoordinator;

    String name, faculty, major, NIM;
    int registYear;

    public UKMProgrammer(String name, String faculty, String major
                        , String NIM, int registYear) {
        this.name = name;
        this.faculty = faculty;
        this.major = major;
        this.NIM = NIM;
        this.registYear = registYear;
    }

    public UKMProgrammer(){
        this.name = null;
        this.faculty = null;
        this.major = null;
        this.NIM = null;
        this.registYear = 0;
    }
    
    public static void display() {
        System.out.println("===================== UKM PROGRAMMER UNHAS =====================");
        System.out.println("1. Add member");
        System.out.println("2. Remove member");
        System.out.println("3. Show list member");
        System.out.println("4. Quit");
        System.out.print("Select what u wanna do :\n => ");
    }

    public void addKoordinator(Koordinator member) {
        this.listKoordinator = new ArrayList<>();

    }

    public void addPengurusInti(PengurusInti member) {
        this.listPengurusInti = new ArrayList<>();
        this.listPengurusInti.add(new PengurusInti(
            member.name,
            member.faculty,
            member.major,
            member.NIM,
            member.registYear));
    }

}

/*
add member
show list member
remove member
quit

*/