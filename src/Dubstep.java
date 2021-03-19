// Find the song hidden between WUB words
public class Dubstep {

    public static String SongDecoder (String song) {
        return String.join(" ", song.replace("WUB", " ").trim().split("\\s+"));
    }

}
