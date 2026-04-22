public class QuantityMeasurementApp {

    public static void main(String[] args) {

        Quantity oneFoot = new Quantity(1.0, Quantity.Unit.FEET);
        Quantity twelveInches = new Quantity(12.0, Quantity.Unit.INCHES);
        Quantity twoFeet = new Quantity(2.0, Quantity.Unit.FEET);
        Quantity twentyFourInches = new Quantity(24.0, Quantity.Unit.INCHES);

        System.out.println(oneFoot.equals(twelveInches));      // true
        System.out.println(twoFeet.equals(twentyFourInches));  // true
        System.out.println(oneFoot.equals(twoFeet));           // false
    }
}
