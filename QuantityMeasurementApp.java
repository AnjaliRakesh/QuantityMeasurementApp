public class QuantityMeasurementApp {

    public static void main(String[] args) {

        Quantity feet = new Quantity(1.0, Quantity.Unit.FEET);
        Quantity inches = new Quantity(12.0, Quantity.Unit.INCHES);

        System.out.println(feet.add(inches, Quantity.Unit.FEET));        // 2.0 FEET
        System.out.println(feet.add(inches, Quantity.Unit.INCHES));      // 24.0 INCHES
        System.out.println(feet.add(inches, Quantity.Unit.YARDS));       // 0.6666666666666666 YARDS

        Quantity yard = new Quantity(1.0, Quantity.Unit.YARDS);
        Quantity threeFeet = new Quantity(3.0, Quantity.Unit.FEET);

        System.out.println(yard.add(threeFeet, Quantity.Unit.YARDS));    // 2.0 YARDS
        System.out.println(yard.add(threeFeet, Quantity.Unit.FEET));     // 6.0 FEET

        Quantity cm = new Quantity(2.54, Quantity.Unit.CENTIMETERS);
        Quantity oneInch = new Quantity(1.0, Quantity.Unit.INCHES);

        System.out.println(cm.add(oneInch, Quantity.Unit.CENTIMETERS));  // ~5.08 CENTIMETERS
    }
}