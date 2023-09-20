class Student{
    String name;
    int roll_no;
    String course;

    public void student(String N, int R , String c){
        this.name = N;
        this.roll_no=R;
        this.course= c;

    }

    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+roll_no);
        System.out.println("Course: "+course);
    }
}

public class StudentR {
    public static void main(String [] args)
{
    Student s1= new Student();
    s1.student("Shashank Suman", 500110478,"B.Tech");
    s1.displayDetails();
}    
}

