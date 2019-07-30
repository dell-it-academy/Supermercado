public class Clock{
    public static Clock instance;

    public static double timeLapse;
    public static int hour;
    public static int minute;

    private Clock(){ hour = 0; minute = 0; timeLapse = 1; }

    public static Clock getInstance(){
        if(instance == null)
            instance = new Clock();
        return instance;
    }
    
    public static void run(){
        minute += timeLapse;
        
        if(minute > 59){
            hour += 1;
            minute -= 60;
        }

        if(hour > 23){
            hour -= 24;
        }
    }
}