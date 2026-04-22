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
        this.value = value;
        this.unit = unit;
    }

    public static double convert(double value, Unit source, Unit target) {

        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException("Value must be finite");
        }

        if (source == null || target == null) {
            throw new IllegalArgumentException("Units cannot be null");
        }

        double valueInBase = value * source.getConversionFactor();
        return valueInBase / target.getConversionFactor();
    }

    public Quantity convertTo(Unit target) {
        double convertedValue = convert(this.value, this.unit, target);
        return new Quantity(convertedValue, target);
    }

    private double toInches() {
        return value * unit.getConversionFactor();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Quantity))
            return false;

        Quantity other = (Quantity) obj;
        return Math.abs(this.toInches() - other.toInches()) < 0.000001;
    }

    @Override
    public String toString() {
        return value + " " + unit;
    }
}