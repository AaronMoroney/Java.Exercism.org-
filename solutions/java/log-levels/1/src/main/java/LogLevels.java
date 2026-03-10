public class LogLevels {
    public static String message(String logLine) {
        return logLine.substring(logLine.indexOf(":")+1).trim();
    }

    public static String logLevel(String logLine) {
        int b = logLine.indexOf("[")+1;
        int e = logLine.indexOf("]");
        
        return  logLine.substring(b,e).toLowerCase();
    }

    public static String reformat(String logLine) {
        String message = logLine.substring(logLine.indexOf(":")+1).trim();
        String level = logLevel(logLine);

        return message + " (" + level + ")";
    }
}
