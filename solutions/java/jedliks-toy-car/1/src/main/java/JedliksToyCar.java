public class JedliksToyCar {
    int currentDistance = 0;
    int battery = 100;
    static final int FIXED_JOURNEY= 20;
    
    public static JedliksToyCar buy() {
        JedliksToyCar car = new JedliksToyCar();
        return car;
    }

    public String distanceDisplay() {
        return "Driven " + currentDistance + " meters";
    }

    public String batteryDisplay() {
         return (battery > 0) 
            ? "Battery at " + battery + "%"
            : "Battery empty";
    }

    public void drive() {
        if(battery > 0) {
            currentDistance = currentDistance + FIXED_JOURNEY; 
            battery = battery - 1;
        } else {
            this.batteryDisplay();
        }
    }
}
