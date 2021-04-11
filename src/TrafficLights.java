// A function to handle each change from "green", to "yellow", to "red",
// and then to "green" again
public class TrafficLights {

    public static String updateLight(String current) {
        return current.equals("green") ? "yellow" : current.equals("yellow") ? "red" : "green";
    }
}
