public class QuantityMeasurementApp {

    public static void main(String[] args) {

        Quantity oneFoot = new Quantity(1.0, LengthUnit.FEET);
        Quantity twelveInches = new Quantity(12.0, LengthUnit.INCHES);
        Quantity oneYard = new Quantity(1.0, LengthUnit.YARDS);
        Quantity oneCm = new Quantity(2.54, LengthUnit.CENTIMETERS);

        System.out.println(oneFoot.convertTo(LengthUnit.INCHES));
        System.out.println(oneFoot.add(twelveInches, LengthUnit.FEET));
        System.out.println(twelveInches.equals(oneYard));
        System.out.println(oneYard.add(oneFoot, LengthUnit.YARDS));
        System.out.println(oneCm.convertTo(LengthUnit.INCHES));

        System.out.println(LengthUnit.FEET.convertToBaseUnit(12.0));
        System.out.println(LengthUnit.INCHES.convertToBaseUnit(12.0));
    }
}