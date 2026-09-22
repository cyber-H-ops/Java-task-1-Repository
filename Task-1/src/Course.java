public class Course {
    static int totalStudentsAllCourses = 0;
    int studentsRegistered;
    String courseName;
    public Course(String courseName, int studentsRegistered) {
        this.courseName = courseName;
        this.studentsRegistered = studentsRegistered;
        totalStudentsAllCourses += studentsRegistered;
    }
    public double calculateAverageAttendance(int[] dailyAttendance) {
        double presentStudents = 0;
        for (int day : dailyAttendance) {presentStudents += day;}
        double averageAttendance = presentStudents / dailyAttendance.length;
        return averageAttendance;
    }
    public double calculatePassPercentage(double studentsPassed) {
        double passPercentage = (studentsPassed / studentsRegistered) * 100;
        return passPercentage;
    }
    public void displayCourseStats() {
        System.out.println("Course: " + courseName);
        System.out.println("  Students registered: " + studentsRegistered);
    }
    public static void displayUniversityStats() {
        System.out.println("Total students registered (all courses): " + totalStudentsAllCourses);
    }}