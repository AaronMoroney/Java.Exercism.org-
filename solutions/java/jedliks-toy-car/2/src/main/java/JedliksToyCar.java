public class JedliksToyCar {
    int currentDistance = 0;
    int battery = 100;
    static final int FIXED_JOURNEY= 20;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + currentDistance + " meters";
    }

    public String batteryDisplay() {
         return (battery == 0) 
            ? "Battery empty"
            : "Battery at " + battery + "%";
    }

    public void drive() {
        if(battery > 0) {
            currentDistance += FIXED_JOURNEY; 
            battery--;
        }
    }
}
