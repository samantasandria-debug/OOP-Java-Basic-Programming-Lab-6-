public class SmallestNumber {
    public static double findSmallest(double a, double b, double c) {
        double smallest = a;
        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest) {
            smallest = c;
        }
        return smallest;
    }

    public static void main(String[] args) {
        double num1 = 25;
        double num2 = 37;
        double num3 = 29;
        
        System.out.println("The smallest value is " + findSmallest(num1, num2, num3));
    }
}
