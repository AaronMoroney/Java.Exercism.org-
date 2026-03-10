public class Lasagna {
    private int expectedMinutesInOven = 40;
    private int preparationTimeInMinutes;
    private int preparationTime = 2;
    
    public int expectedMinutesInOven() {
        return this.expectedMinutesInOven;
    }
    
    public int remainingMinutesInOven(int minutes) {
        return expectedMinutesInOven() - minutes;
    }

    public int preparationTimeInMinutes(int numberOfLayers) {
        // 2 minutes per layer * number of layers
        return this.preparationTimeInMinutes = numberOfLayers * preparationTime;
    }

    public int totalTimeInMinutes(int numberOfLayers, int minutes) {
        return preparationTimeInMinutes(numberOfLayers) + minutes;
    }
}
