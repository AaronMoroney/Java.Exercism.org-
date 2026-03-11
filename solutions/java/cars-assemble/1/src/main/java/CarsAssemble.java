public class CarsAssemble {
    final static int CARS_PER_HOUR = 221;
    
    public double roundResult(double result) {
        return Math.round(result * 10d) / 10d; 
    }

    public double productionRatePerHour(int speed) {
        return switch (speed) {
            case 1, 2, 3, 4 -> speed * CARS_PER_HOUR;

            case 5, 6, 7, 8 -> {
                double result = speed * CARS_PER_HOUR * 0.9;
                yield roundResult(result);
            }

            case 9 -> {
                double result = speed * CARS_PER_HOUR * 0.8;
                yield roundResult(result);
            }

            case 10 -> {
                double result = speed * CARS_PER_HOUR * 0.77;
                yield roundResult(result);
            }

            default -> 0;
        };
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
