package app;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Race {
    private Integer racer;
    private boolean isStart;
    private CopyOnWriteArrayList<String> listRunner = new CopyOnWriteArrayList<>();

    public Race() {
        this.racer = 0;
        this.isStart = false;
    }

    public void start() {
        if (this.racer >= 3) {
            this.isStart = true;
            System.out.println("The race starts ...\n");
        } else  {
            System.out.println("the race cannot be started, runners not enough");
        }
        
    }

    public void result() {
        try {
            Thread.sleep(this.racer * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (this.listRunner.size() != racer) continue;
        System.out.println("\nThe race is over ...\n");
        System.out.println("1st : " + this.listRunner.get(0));
        System.out.println("2nd : " + this.listRunner.get(1));
        System.out.println("3rd : " + this.listRunner.get(2));

        for (int i = 3; i < this.listRunner.size(); i++)
            System.out.println(this.listRunner.get(i) + " lose");
    }       

    public void racerIn() {
        this.racer++;
    }

    public boolean isStart() {
        return this.isStart;
    }

    public Integer getRacer() {
        return this.racer;
    }

    public CopyOnWriteArrayList<String> getListRunner() {
        return this.listRunner;
    }

    public void addRunner(String runner) {
        listRunner.add(runner);
    }
    

}
