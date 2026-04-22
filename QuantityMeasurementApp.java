public class QuantityMeasurementApp {

    public static void main(String[] args) {

        QuantityWeight oneKg = new QuantityWeight(1.0, WeightUnit.KILOGRAM);
        QuantityWeight thousandGram = new QuantityWeight(1000.0, WeightUnit.GRAM);
        QuantityWeight onePound = new QuantityWeight(1.0, WeightUnit.POUND);

        System.out.println(oneKg.equals(thousandGram));
        System.out.println(oneKg.convertTo(WeightUnit.GRAM));
        System.out.println(onePound.convertTo(WeightUnit.KILOGRAM));
        System.out.println(oneKg.add(thousandGram));
        System.out.println(oneKg.add(thousandGram, WeightUnit.GRAM));
    }
}