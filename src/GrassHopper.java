// Get the letter associated with the average of three values
public class GrassHopper {
    public static char getGrade(int s1, int s2, int s3) {
        int average = (s1 + s2 + s3) / 3;
        if (average < 60) {
            return 'F';
        } else if (average < 70) {
            return 'D';
        } else if (average < 80) {
            return 'C';
        } else if (average < 90) {
            return 'B';
        } else {
            return 'A';
        }
    }
}
