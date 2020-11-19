
public 	class Q4b{
   public static void main(String [] args){
       
       Course course = new Course("Introduction to Computers", 250.0);
       
       course.addStudent("Ali Said");
       course.addStudent("Wong Ken");
       course.addStudent("Peter Lim");
       
       System.out.println(course.toString());
       
       System.out.println("\nTotal fees collected : " + course. calcFeesCollected());
       
       String [] names = course.getStudentNames();
              
       System.out.println("\nList of students in the course: ");
       for (int i=0; i< course.getNoOfStudents(); i++){
             System.out.println("\t" + names[i]);
       }

   }
}
