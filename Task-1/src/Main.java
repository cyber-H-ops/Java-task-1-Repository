public class Main {
    public static void main(String[] args) {
        Course java101 = new Course("Java Programming", 40);
        Course db101   = new Course("Database Systems", 35);
        Course net101  = new Course("Computer Networks", 50);
        System.out.println("- Individual Course Statistics -");
        java101.displayCourseStats();
        db101.displayCourseStats();
        net101.displayCourseStats();
        System.out.println("Course Attendance");
        int[] javaAttendance = {35, 38, 40, 33, 37};
        double javaAvgAttendance = java101.calculateAverageAttendance(javaAttendance);
        System.out.println("Java Programming average daily attendance: " + javaAvgAttendance);
        double javaPassPercentage = java101.calculatePassPercentage(32);
        System.out.println("Java Programming pass percentage: " + javaPassPercentage + "%");
        int[] dbAttendance = {30, 32, 31, 29, 34};
        double dbAvgAttendance = db101.calculateAverageAttendance(dbAttendance);
        System.out.println("Database Systemsaverage daily attendance: " + javaAvgAttendance);
        double dbPassPercentage = db101.calculatePassPercentage(28);
        System.out.println("Database Systems pass percentage: " + javaPassPercentage + "%");
        int[] netAttendance = {45, 48, 50, 42, 47};
        double netAvgAttendance = net101.calculateAverageAttendance(netAttendance);
        System.out.println("Computer Networks average daily attendance: " + javaAvgAttendance);
        double netPassPercentage = net101.calculatePassPercentage(42);
        System.out.println("Computer Networks pass percentage: " + javaPassPercentage + "%");
        System.out.println("- University-Wide Statistics -");
        Course.displayUniversityStats();
    }
}