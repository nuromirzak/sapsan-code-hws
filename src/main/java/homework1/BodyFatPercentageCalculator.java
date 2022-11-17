package homework1;

class BodyFatPercentageCalculator {
    public static double calculate(double height, double waistCircumference, Sex sex) {
        if (sex == null) {
            throw new IllegalArgumentException("sex cannot be null");
        }
        return 64 - (20 * (waistCircumference / height)) + (sex == Sex.MALE ? 12 : 0);
    }

    private BodyFatPercentageCalculator() {

    }
}
