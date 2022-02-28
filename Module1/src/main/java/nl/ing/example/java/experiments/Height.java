package nl.ing.example.java.experiments;

import static java.util.Objects.hash;

record Height(MeasurementUnit measurementUnit, double value) {

    public Height inCM() {
        return switch (measurementUnit) {
            case M -> {
                var valueInCM = value * 100;
                yield new Height(MeasurementUnit.CM, valueInCM);
            }
            case CM -> this;
            case null -> new Height(MeasurementUnit.CM, value);
        };
    }

    public Height inM() {
        return switch (measurementUnit) {
            case CM -> new Height(MeasurementUnit.M, value/100);
            case M, default -> this;
        };
    }

    static String formatValue(Object o) {
        return switch (o) {
            case String s && s.length() > 1	-> s.trim();
            case Integer i && i < 3 -> String.valueOf(i);
            default	-> o.toString();
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Height height = (Height) o;
        return Double.compare(height.value, value) == 0 && measurementUnit == height.measurementUnit;
    }

    @Override
    public int hashCode() {
        return hash(measurementUnit, value);
    }

    enum MeasurementUnit {
        CM,
        M;
    }
}
