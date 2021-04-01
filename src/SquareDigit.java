// Square every digit of a number and concatenate them
public class SquareDigit {
    public int squareDigits(int n) {
        return String.valueOf(n).chars()
                .mapToObj(c -> Character.getNumericValue((char) c))
                .map(i -> i * i)
                .reduce(0, (a, b) -> Integer.valueOf(a.toString() + b.toString()));
    }
}
