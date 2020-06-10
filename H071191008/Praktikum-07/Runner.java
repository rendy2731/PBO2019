class Runner implements Runnable{

    private int number;
    private Thread thread;
    private Race race;

    public Runner(Integer number) {
        this.number = number;
        thread = new Thread(this); 
	}
	public Runner joinRace(Race race) {
        if (this.race == null) {
            this.race = race;
            race.totalRunner++;
        }
        return this;
    }
    public String getNumber() {
        return String.format("Runner %d", number);
    }
	public void start() {
        try {
            joinRace(race);
            thread.start();
        }
        catch (NullPointerException npe) {
            System.out.printf("%s have not entered any race\n", getNumber());
        }
	}
    @Override 
    public void run() {
        if (race.isRaceStarted) {
            System.out.printf("%s running . . .\n", getNumber());
            try {
                Thread.sleep(race.durationRace);
            }
            catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            race.position.add(getNumber());
        }
        else {
            System.out.printf("Hey %s, the race hasn't started yet\n", getNumber());
        }
    }
} 