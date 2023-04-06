import java.util.ArrayList;

public class Student extends Person {
  private int numCourses = 0;
  private ArrayList<String> courses;
  private ArrayList<Integer> grades;
  public Student(String name,String address){
    super(name, address);
  }
  public void addCourseGrade(String course, int grade){
    courses.add(course);
    grades.add(grade);
    numCourses++;

  }
  public void printGrades(){
    for (int i=0; i<=courses.size();i++){
      System.out.println(courses.get(i) + ": "+ grades.get(i));
    }

  }
  public double getAverageGrade(){
    double temp = 0;
    for (int j=0; j<=numCourses;j++){
      temp = temp + grades.get(j);
    }
    return temp/numCourses;
  }
  @Override
  public String toString(){
    return "Siswa ini bernama " + Student.super.getName() + "dan tinggal di " + Student.super.getAddress();
  }
}
