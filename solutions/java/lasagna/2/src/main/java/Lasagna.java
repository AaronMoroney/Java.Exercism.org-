public class Lasagna {
    private int expectedMinutesInOven = 40;
    private int remainingMinutesInOven;
    private int preparationTimeInMinutes;
    private int preparationTime = 2;
    private int totalTimeInMinutes;
    
    public int expectedMinutesInOven() {
        return this.expectedMinutesInOven;
    }
    
    public int remainingMinutesInOven(int minutes) {
        return this.remainingMinutesInOven = expectedMinutesInOven - minutes;
    }

    public int preparationTimeInMinutes(int numberOfLayers) {
        // 2 minutes per layer * number of layers
        return this.preparationTimeInMinutes = numberOfLayers * preparationTime;
    }

    public int totalTimeInMinutes(int numberOfLayers, int minutes) {
        return this.totalTimeInMinutes = (numberOfLayers * 2) + minutes;
    }
}
