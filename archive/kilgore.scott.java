public class TestErrors {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = "10";
        
        System.out.println("Sum is: " + add(num1, num2));
    }
    
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
}
