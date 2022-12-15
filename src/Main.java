public class Main {

    public static String truncate(String input) {

        StringBuilder str = new StringBuilder();
        input.codePoints().limit(5).forEach(code->str.appendCodePoint(code));
        return str.toString();
    }


    public static void main(String[] args) {
        System.out.println(truncate("💇💇💇💇💇💇💇💇💇💇💇💇💇💇💇"));
    }
}