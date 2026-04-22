public class Quantity {

    public enum Unit {
        FEET, INCHES
    }

    private final double value;
    private final Unit unit;

    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    private double toFeet() {
        switch (unit) {
            case FEET:
                return value;
            case INCHES:
                return value / 12.0;
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

        return Double.compare(this.toFeet(), other.toFeet()) == 0;
    }
}