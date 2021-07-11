// A number is a Special Number if it’s digits only consist 0, 1, 2, 3, 4 or 5
public class SpecialNumber {

    public static String specialNumber(int number) {
        return String.valueOf(number).matches("[012345]*") ? "Special!!" : "NOT!!";
    }
}
