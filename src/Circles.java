public class Circles {
    public static void main(String[] args) {
        System.out.println("Enter number of circles");
        double c = StdIn.readDouble();

        System.out.println("Enter min/max radius");
        double rmin = StdIn.readDouble();
        double rmax = StdIn.readDouble();

        double rx= Math.random();
        double ry= Math.random();
        double radius= Math.random();

        for (int i=0;i <= c;i++) {
            StdDraw.setXscale(rmin,rmax);
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledCircle(rx, ry, radius);
            StdDraw.show();
        }
    }


}
