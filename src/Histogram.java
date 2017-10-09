public class Histogram {

        public static void main(String[] args) {
            int n = StdIn.readInt();
            int lo = StdIn.readInt();
            int hi = StdIn.readInt();

            StdDraw.setXscale(-300, +300);
            StdDraw.setYscale(-300, +300);
            StdDraw.clear(StdDraw.BLACK);
            StdDraw.enableDoubleBuffering();

            for (double t = 0.0; t < n; t++) {

                StdDraw.show();
                StdDraw.pause(20);
            }

        }

    }

