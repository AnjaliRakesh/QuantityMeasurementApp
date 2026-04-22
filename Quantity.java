public class Quantity {

    public enum Unit {
        FEET(12.0),
        INCHES(1.0),
        YARDS(36.0),
        CENTIMETERS(0.393701);

        private final double conversionFactor;

        Unit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        public double getConversionFactor() {
            return conversionFactor;
        }
    }

    private final double value;
    private final Unit unit;

    public Quantity(double value, Unit unit) {
        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException("Value must be finite");
        }

        if (unit == null) {
            throw new IllegalArgumentException("Unit cannot be null");
        }

        this.value = value;
        this.unit = unit;
    }

    public Quantity add(Quantity other) {
        return add(other, this.unit);
    }

    public Quantity add(Quantity other, Unit targetUnit) {

        if (other == null) {
            throw new IllegalArgumentException("Other quantity cannot be null");
        }

        if (targetUnit == null) {
            throw new IllegalArgumentException("Target unit cannot be null");
        }

        double thisInInches = this.value * this.unit.getConversionFactor();
        double otherInInches = other.value * other.unit.getConversionFactor();

        double totalInInches = thisInInches + otherInInches;
        double resultValue = totalInInches / targetUnit.getConversionFactor();

        return new Quantity(resultValue, targetUnit);
    }

    @Override
    public String toString() {
        return value + " " + unit;
    }
}