package eka.Exc;

import java.util.concurrent.CopyOnWriteArrayList;

public class Race {
    int durationRace;
    int totalRunner;
    boolean isRaceStarted = false;

    CopyOnWriteArrayList<String> position = new CopyOnWriteArrayList<>();

	public void start() {
        if (totalRunner >= 3) {
            isRaceStarted = true;
            durationRace = 1000 * totalRunner;
            System.out.println("The race starts . . .");
        }
        else {
            System.out.println("The race cannot be started, runners are not enough");
        }
    }
    
    public void result() {
        while (isRaceStarted) {
            if (position.size() == totalRunner) {
                System.out.println("The race is over.\n");

                String[] arr = { "1st : ", "2st : ", "3st : " };
                int result = 0;

                for (String position : position) {
                    if (result < 3) {
                        System.out.printf("%s %s \n", arr[result], position);
                    }
                    else {
                        System.out.printf("%s loses \n", position);
                    }
                    if (result == 2) {
                        System.out.println();
                    }
                    result++;
                }
                return;
            }
        }
	}

}