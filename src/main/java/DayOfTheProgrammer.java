public class DayOfTheProgrammer {
    /**
     * Challenge page: https://www.hackerrank.com/challenges/day-of-the-programmer/problem
     */
    public static String dayOfProgrammer(int year) {
        boolean isJulianCalendar = year < 1918;
        boolean isLeapByJulian = year % 4 == 0;
        boolean isLeapByGeorgian = year % 400 == 0 || isLeapByJulian && year % 100 != 0;
        boolean addOneDay = isJulianCalendar & isLeapByJulian || isLeapByGeorgian;

        return String.format(
                "%02d.09.%s",
                13 - (addOneDay ? 1 : 0) + (year == 1918 ? 13 : 0),
                year
        );
    }

    public static String dayOfProgrammerShortVersion(int year) {
        return String.format(
                "%02d.09.%s",
                13 - (year < 1918 & year % 4 == 0 || year % 400 == 0 || year % 4 == 0 && year % 100 != 0 ? 1 : 0) + (year == 1918 ? 13 : 0),
                year
        );
    }
}
