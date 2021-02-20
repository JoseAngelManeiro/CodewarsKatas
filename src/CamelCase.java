public class CamelCase {

    static String toCamelCase(String s) {
        String[] array = s.split("[_|-]");
        StringBuilder sb = new StringBuilder(array[0]);
        for (int i = 1; i < array.length; i++) {
            sb.append(Character.toUpperCase(array[i].charAt(0))).append(array[i].substring(1));
        }
        return sb.toString();
    }

}
