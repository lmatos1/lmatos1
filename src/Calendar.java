public class Calendar {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int year = Integer.parseInt(args[1]);

// months[i] = name of month i

        String[] months = {

                "",

                "January", "February", "March",

                "April", "May", "June",

                "July", "August", "September",

                "October", "November", "December"

        };

// days[i] = number of days in month i

        int[] days = {

                0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31

        };

// check for leap year
        if (month == 2 && isLeapYear(year)) days[month] = 29;


        System.out.println(" " + months[month] + " " + year);


        int firstDay = day(month, 1, year);
        System.out.println(" S M Tu W Th F S");


        if ((firstDay % 7) >= 0) {
            if ((firstDay % 7) == 0) {

            } else if ((firstDay % 7) == 1) {

                System.out.print(" ");
            } else if ((firstDay % 7) == 2) {

                System.out.print("\t");
            } else if ((firstDay % 7) == 3) {

                System.out.print("\t\t ");
            } else if ((firstDay % 7) == 4) {

                System.out.print("\t\t");
            } else if ((firstDay % 7) == 5) {

                System.out.print("\t\t ");
            } else if ((firstDay % 7) == 6) {

                System.out.print("\t\t ");
            }

        }


        for (int i = 1; i <= days[month]; i++) {

            System.out.printf("%2d ", i);
            if (((i + firstDay) % 7 == 0) || (i == days[month]))
                System.out.println();
        }

    }

    public static int day(int month, int day, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + x + (31 * m) / 12) % 7;
        return d;
    }

    // return true if the given year is a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0)) return true;
        if (year % 400 == 0) return true;
        return false;
    }


}
