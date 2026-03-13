
class BirdWatcher {
    private final int[] birdsPerDay;
    int lastWeeksCount[] = new int[] {0, 2, 5, 3, 7, 8, 4};
    int birdsVisited = 0;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.lastWeeksCount;
    }

    public int getToday() {
        return this.birdsPerDay[birdsPerDay.length -1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length -1]++;
    }

    public boolean hasDayWithoutBirds() {
        // for each / enhanced for loop
        for(int birds : birdsPerDay) {
            if(birds == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        // The middle part of a for-loop can contain multiple conditions.
        // The loop continues only while BOTH conditions are true.
        // for (initialisation; condition; update)
        for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++) {
            birdsVisited += birdsPerDay[i];
        }
        return birdsVisited;
    }

    public int getBusyDays() {
        int busyDays = 0;
         for(int birds : birdsPerDay) {
             if(birds >= 5) {
                 busyDays++;
             }
         }
        return busyDays;
    }
}
