public class MainPr1 {
    public static void main(String[] args) {
        printEqual(1, 2, 3);
        printEqual(-1, 2, 3);

        System.out.println(convertToCentimeters(54));
        System.out.println(convertToCentimeters(5, 4));

        System.out.println(areaCalculator(-1));
        System.out.println(areaCalculator(-1, 4));

        System.out.println(areaCalculator(5));
        System.out.println(areaCalculator(5, 4));

        printYearsAndDays(561600);

        isCatPlaying(false, 35);
    }

    public static void isCatPlaying(boolean summer, int temp) {
        if (summer && temp > 25 && temp <= 45) {
            System.out.println(true);
        } else System.out.println(temp > 25 && temp <= 35);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes > 0) {
            System.out.printf("%d min = %d y and %d d \n", minutes, (((minutes / 60) / 24) / 365), (minutes - (((minutes / 60) / 24) / 365) * 525600) / 60 / 24);
        } else {
            System.out.println("invalid value");
        }
    }

    public static double areaCalculator(double radius) {
        if (radius < 0) {
            return -1.0;
        } else {
            return ((radius * radius) * 3.14);
        }
    }

    public static double areaCalculator(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        } else {
            return x * y;
        }
    }

    private static double convertToCentimeters(int height) {
        return height * 2.54;
    }

    private static double convertToCentimeters(int heightFeet, int heightInches) {
        return convertToCentimeters((heightFeet * 12) + heightInches);
    }

    private static void printEqual(int p1, int p2, int p3) {
        if (p1 > 0 && p2 > 0 && p3 > 0) {
            if (p1 == p2 && p2 == p3) {
                System.out.println("all nums are equal");
            } else if (p1 != p2 && p1 != p3 && p2 != p3) {
                System.out.println("all nums are different");
            } else {
                System.out.println("neither are equal or different");
            }
        } else {
            System.out.println("invalid value");
        }
    }
}
