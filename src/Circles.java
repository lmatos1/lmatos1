public class Circles {
    public static void main(String[] args) {
        System.out.println("Enter number of circles");
        int b = StdIn.readInt();




        for (int i=0; i < b; i++) {
            double rx= Math.random();
            double ry= Math.random();
            double radius= Math.random();
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledCircle(rx, ry, radius);
            double wrx= Math.random();
            double wry= Math.random();
            double wradius= Math.random();
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.filledCircle(wrx, wry, wradius);
            StdDraw.show();
        }





    }


}
