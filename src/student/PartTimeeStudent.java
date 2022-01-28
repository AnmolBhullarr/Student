
package student;

public class PartTimeeStudent extends Student {
        
        private int numCourses;
        
        public PartTimeStudent(String studentId,String studentName,int numCourses){
            super(studenId, studentName );
            this.numCouses=numCourses;
        }

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
        
    
}
