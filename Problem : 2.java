public class AverageCalculator {
    public static double computeAverage(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        double num1 = 25;
        double num2 = 45;
        double num3 = 65;
        
        System.out.println("The average value is " + computeAverage(num1, num2, num3));
    }
}
