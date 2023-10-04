public class PMDError {
    private int unusedVariable = 42; // This variable is never used, PMD will catch this.

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
