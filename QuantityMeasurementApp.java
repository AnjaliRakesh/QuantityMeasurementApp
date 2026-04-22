public class QuantityMeasurementApp {

    public static boolean compareFeet(double value1, double value2) {
        Feet feet1 = new Feet(value1);
        Feet feet2 = new Feet(value2);
        return feet1.equals(feet2);
    }

    public static boolean compareInches(double value1, double value2) {
        Inches inch1 = new Inches(value1);
        Inches inch2 = new Inches(value2);
        return inch1.equals(inch2);
    }

    public static void main(String[] args) {

        System.out.println(compareFeet(1.0, 1.0));     // true
        System.out.println(compareFeet(1.0, 2.0));     // false

        System.out.println(compareInches(1.0, 1.0));   // true
        System.out.println(compareInches(1.0, 2.0));   // false
    }
}
