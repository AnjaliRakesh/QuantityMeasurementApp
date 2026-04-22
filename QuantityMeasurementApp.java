public class QuantityMeasurementApp {

    public static void main(String[] args) {

        Quantity q1 = new Quantity(1.0, Quantity.Unit.FEET);
        Quantity q2 = new Quantity(12.0, Quantity.Unit.INCHES);
        System.out.println(q1.add(q2)); // 2.0 FEET

        Quantity q3 = new Quantity(12.0, Quantity.Unit.INCHES);
        Quantity q4 = new Quantity(1.0, Quantity.Unit.FEET);
        System.out.println(q3.add(q4)); // 24.0 INCHES

        Quantity q5 = new Quantity(1.0, Quantity.Unit.YARDS);
        Quantity q6 = new Quantity(3.0, Quantity.Unit.FEET);
        System.out.println(q5.add(q6)); // 2.0 YARDS

        Quantity q7 = new Quantity(2.54, Quantity.Unit.CENTIMETERS);
        Quantity q8 = new Quantity(1.0, Quantity.Unit.INCHES);
        System.out.println(q7.add(q8)); // ~5.08 CENTIMETERS
    }
}