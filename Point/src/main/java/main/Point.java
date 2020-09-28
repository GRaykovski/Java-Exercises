package main;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void changeLocation(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.printf("The point's location is set to (%d,%d)%n", x, y);
    }

    public void calcDistanceTo(Point point) {
        double formula1 = point.x - x;
        double res1 = Math.pow(formula1, 2);
        double formula2 = point.y - y;
        double res2 = Math.pow(formula2, 2);
        double formula = Math.sqrt(res1 + res2);
        System.out.printf("The distance between the points is %.3f%n", formula);
    }

    public void calcDistanceToOrigin() {
        double formula1 = 0 - x;
        double res1 = Math.pow(formula1, 2);
        double formula2 = 0 - y;
        double res2 = Math.pow(formula2, 2);
        double formula = Math.sqrt(res1 + res2);
        System.out.printf("The distance from the origin is %.3f%n", Math.abs(formula));
    }

    public static void main(String[] args) {
        Point p1 = new Point(7, 2);
        Point p2 = new Point (4, 3);
        p1.calcDistanceTo(p2);

        Point p3 = new Point (9, 14);
        p3.changeLocation(6, 3);

        Point p4 = new Point(13, 5);
        p4.calcDistanceToOrigin();
    }

}

