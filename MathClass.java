public class MathClass {
    public static void main(String[] args) {
        System.out.println("Square root of 25.0 is " + Math.sqrt(25.0));
        System.out.println("2.0 raised to the power of 3.0 is " + Math.pow(2.0, 3.0));
        System.out.println("Sine of 90 degrees is " + Math.sin(Math.toRadians(90)));
        System.out.println("Cosine of 0 degrees is " + Math.cos(Math.toRadians(0)));
        System.out.println("Tangent of 45 degrees is " + Math.tan(Math.toRadians(45)));
        System.out.println("180 degrees in radians is " + Math.toRadians(180));
        System.out.println("PI radians in degrees is " + Math.toDegrees(Math.PI));
        System.out.println("Natural logarithm of e is " + Math.log(Math.E));
        System.out.println("Base 10 logarithm of 100.0 is " + Math.log10(100.0));
        System.out.println("Absolute value of -10 is " + Math.abs(-10));
        System.out.println("Absolute value of -5.5 is " + Math.abs(-5.5));
        System.out.println("Closest long to 3.6 is " + Math.round(3.6));
        System.out.println("Smallest integer greater than 4.1 is " + Math.ceil(4.1));
        System.out.println("Largest integer less than 4.9 is " + Math.floor(4.9));
        System.out.println("Minimum of 5 and 10 is " + Math.min(5, 10));
        System.out.println("Maximum of 5 and 10 is " + Math.max(5, 10));
    }
}
