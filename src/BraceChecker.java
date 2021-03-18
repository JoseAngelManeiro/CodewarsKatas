// Write a function to determine if the order of the braces is valid
public class BraceChecker {

    public boolean isValid(String braces) {
        char[] stack = new char[braces.length()];
        int size = 0;
        for(int i = 0; i < braces.length(); i++) {
            char c = braces.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                stack[size++] = c; // Push
            } else {
                if (size == 0 || !areNested(stack[size - 1], c)) {
                    return false;
                } else {
                    size--; // Pop
                }
            }

        }
        return size == 0;
    }

    private boolean areNested(char a, char b) {
        return (a == '{' && b == '}') || (a == '[' && b == ']') || (a == '(' && b == ')');
    }
}
