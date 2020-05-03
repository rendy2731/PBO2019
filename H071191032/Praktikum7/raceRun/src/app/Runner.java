package app;

public class Runner implements Runnable{
    private Integer number;
    private Thread thread;
    private Race race;

    public Runner(Integer number) {
       this.number = number;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " running ...");

        try {
            Thread.sleep(this.race.getRacer() * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } synchronized (this.race.getListRunner()) {
            this.race.addRunner(Thread.currentThread().getName());
        }
    }


    public void start() {
        if (this.thread != null && this.race.isStart()) {
            this.thread.start();
        } else if (this.thread == null) {
            System.out.println(this.thread.getName() + " have not entered any race");
        } else if (!this.race.isStart()) {
            System.out.println("Hey " + this.thread.getName() + ", the race hasn't started yet");
        }
    }

    public Runner joinRace(Race race) {
        if (this.race == null) {
            this.race = race;
            this.thread = new Thread(this);
            this.race.racerIn();
            thread.setName("Runner-" + this.number);
        }
        return this;
    }
    
}