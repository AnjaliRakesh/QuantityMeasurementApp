public class QuantityMeasurementApp {

    public static void main(String[] args) {

        Quantity oneYard = new Quantity(1.0, Quantity.Unit.YARDS);
        Quantity threeFeet = new Quantity(3.0, Quantity.Unit.FEET);
        Quantity thirtySixInches = new Quantity(36.0, Quantity.Unit.INCHES);

        Quantity oneCm = new Quantity(1.0, Quantity.Unit.CENTIMETERS);
        Quantity pointThreeNineThree = new Quantity(0.393701, Quantity.Unit.INCHES);

        System.out.println(oneYard.equals(threeFeet));          // true
        System.out.println(oneYard.equals(thirtySixInches));    // true
        System.out.println(oneCm.equals(pointThreeNineThree));  // true
        System.out.println(oneCm.equals(threeFeet));            // false
    }
}