package tasks.Task3;

class StudentGrade{
    private String name;
    private int age;
    private String grade;

    public StudentGrade(){
        name = "unknown";
        age = 0;
        grade = "not assigned";
    }
    public StudentGrade(String student,int age){
       this.name=student;
       this.age=age;
        this.grade="not assigned";
    }
    public StudentGrade(String student,int age,String grade){
       this.name=student;
       this.age=age;
        this.grade=grade;
    }
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Grade : "+grade);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        // StudentGrade student1 = new StudentGrade();
        // StudentGrade student2 = new StudentGrade("Gokul",20);
        StudentGrade student3 = new StudentGrade("John",23,"A");
        // student1.display();
        // student2.display();
        student3.display();
    }
}
