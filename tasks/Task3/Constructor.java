package tasks.Task3;

class Student{
      String name;
      public Student(){
        name="Gokulnath";
      }
      public void display(){
        System.out.println("Name : "+name);
      }
}

public class Constructor {
    public static void main(String[] args){
         Student myStudent = new Student();
         myStudent.display();
    }
}
