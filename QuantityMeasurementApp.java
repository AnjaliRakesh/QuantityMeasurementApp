public class QuantityMeasurementApp {

    public static void demonstrateLengthConversion(double value,
                                                   Quantity.Unit from,
                                                   Quantity.Unit to) {

        double result = Quantity.convert(value, from, to);

        System.out.println(value + " " + from + " = " + result + " " + to);
    }

    public static void demonstrateLengthConversion(Quantity quantity,
                                                   Quantity.Unit to) {

        Quantity converted = quantity.convertTo(to);

        System.out.println(quantity + " = " + converted);
    }

    public static void main(String[] args) {

        demonstrateLengthConversion(1.0,
                Quantity.Unit.FEET,
                Quantity.Unit.INCHES);

        demonstrateLengthConversion(3.0,
                Quantity.Unit.YARDS,
                Quantity.Unit.FEET);

        demonstrateLengthConversion(36.0,
                Quantity.Unit.INCHES,
                Quantity.Unit.YARDS);

        demonstrateLengthConversion(1.0,
                Quantity.Unit.CENTIMETERS,
                Quantity.Unit.INCHES);

        Quantity length = new Quantity(2.0, Quantity.Unit.YARDS);
        demonstrateLengthConversion(length, Quantity.Unit.INCHES);
    }
}