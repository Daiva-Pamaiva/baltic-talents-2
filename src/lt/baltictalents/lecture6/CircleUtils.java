package lt.baltictalents.lecture6;

class CircleUtils {
    static double getArea(Circle k) {
        return Math.PI * Math.pow(k.getR(), 2);
    }

    static double getArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    static double getPerimeter(Circle k) {
        return 2 * Math.PI * k.getR();
    }

    static double getPerimeter(double r) {
        return 2 * Math.PI * r;
    }
}
