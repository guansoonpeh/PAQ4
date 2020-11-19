
public class Course {

    private String courseTitle;
    private double feesPerStudent;
    private int noOfStudents;
    private String[] studentNames;

    private static int courseCount;

    Course(String courseTitle, double feesPerStudent) {
        this.courseTitle = courseTitle;
        this.feesPerStudent = feesPerStudent;
        studentNames = new String[100];
        courseCount++;
    }
    
    public String getCourseTitle() {
        return courseTitle;
    }

    public double getFeesPerStudent() {
        return feesPerStudent;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public String[] getStudentNames() {
        return studentNames;
    }

    public static int getCourseCount() {
        return courseCount;
    }

    public void setFeesPerStudent(double feesPerStudent) {
        this.feesPerStudent = feesPerStudent;
    }

    public void setCourseTitle(String courseTitle) {

        this.courseTitle = courseTitle;

    }

    public double calcFeesCollected() {
        return feesPerStudent * noOfStudents;
    }

    public void addStudent(String studName) {
        
        //if ( noOfStudents < 100){
          studentNames[noOfStudents] = studName;
          noOfStudents++;
        //}else{
        //    System.err.println ("Fulled");
                   
       // }
    }

    public String toString() {
        return "Course Title : " + courseTitle + "\n" +
                "Fees : " + String.format("%.2f", feesPerStudent) + "\n" +
                "No. Of students : " + noOfStudents;
    }
}
