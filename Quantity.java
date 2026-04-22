public class Quantity {

    public enum Unit {
        FEET,
        INCHES,
        YARDS,
        CENTIMETERS
    }

    private final double value;
    private final Unit unit;

    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    private double toInches() {
        switch (unit) {
            case FEET:
                return value * 12.0;

            case INCHES:
                return value;

            case YARDS:
                return value * 36.0;

            case CENTIMETERS:
                return value * 0.393701;

            default:
                throw new IllegalArgumentException("Invalid Unit");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Quantity other = (Quantity) obj;

        return Double.compare(this.toInches(), other.toInches()) == 0;
    }
}