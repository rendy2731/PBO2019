public class Frog {
    private String color;
    private int jump;

    public Frog(String color, int jump) {
        this.color = color;
        this.jump = jump;
    }

    public boolean compare(Frog frog) {
        return this.jump > frog.jump ? true : false;
    }

    public static int getMax(Frog frogs[]) {
        int max = frogs[0].jump;

        for (int i = 1; i < frogs.length; i++) {
            max = frogs[i].jump > max ? frogs[i].jump : max;
        }
        return max;
    }

    public boolean getRun(Field field) {
        if (field != null) {
            return true;
        }
        return false;
    }

    public void getProcess(Field field) {
        if (getRun(field)) {
            int foothold = 0;
            for (int i = 0; i < field.getBambooHeight().length; i++) {
                if (jump - (field.getBambooHeight(i) - foothold) > 0) {
                    System.out.println("Katak berwarna " + color + " berhasil melompati bambu ke-" + (i + 1));
                } else {
                    System.out.println("Katak berwarna " + color + " gagal melompati bambu ke-" + (i + 1));
                    break;
                }
            }
        } else {
            System.out.println("Field tidak ada");
        }
    }
    
}