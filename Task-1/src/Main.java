public class Main {
    public static void main(String[] args) {
        Course java101 = new Course("Java Programming", 40);
        Course db101   = new Course("Database Systems", 35);
        Course net101  = new Course("Computer Networks", 50);
        int[] javaAttendance = {35, 38, 40, 33, 37};
        double javaAvgAttendance = java101.calculateAverageAttendance(javaAttendance);
        double javaPassPercentage = java101.calculatePassPercentage(32);
        int[] dbAttendance = {30, 32, 31, 29, 34};
        double dbAvgAttendance = db101.calculateAverageAttendance(dbAttendance);
        double dbPassPercentage = db101.calculatePassPercentage(28);
        int[] netAttendance = {45, 48, 50, 42, 47};
        double netAvgAttendance = net101.calculateAverageAttendance(netAttendance);
        double netPassPercentage = net101.calculatePassPercentage(42);
    }
}
