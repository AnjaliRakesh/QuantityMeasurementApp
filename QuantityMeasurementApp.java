public class QuantityMeasurementApp {

    public boolean compareFeet(double value1, double value2) {
        return value1 == value2;
    }

    public static void main(String[] args) {
        QuantityMeasurementApp app = new QuantityMeasurementApp();

        System.out.println(app.compareFeet(0.0, 0.0));
        System.out.println(app.compareFeet(1.0, 1.0));
        System.out.println(app.compareFeet(1.0, 2.0));
    }
}