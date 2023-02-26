public class TimeService {

    private static int time;

    public static void incrementTime() {
        time = time + 1;
    }

    public static int getTime() {
        return time;
    }

}
