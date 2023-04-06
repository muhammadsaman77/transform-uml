import java.util.ArrayList;

public class Teacher extends Person {
  private int numCourses = 0;
  private ArrayList<String> courses;
  public Teacher(String name,String address){
    super(name,address);
  }
  public boolean addCourse(String course){
    for (int i=0;i<=numCourses;i++){
      if (courses.get(i)== course){
        return false;
      }
    }
    courses.add(course);
    return true;
  }
  public boolean removeCourse(String course){
    for (int i=0;i<=numCourses;i++){
      if(courses.get(i)==course){
        courses.remove(i);
        return true;
      }
    }
    return false;
  }
  @Override
  public String toString(){
    return "Guru ini bernama " + Teacher.super.getName() + "dan tinggal di " + Teacher.super.getAddress();
  }
}
