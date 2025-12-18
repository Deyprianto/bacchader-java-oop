class StudentDetails{
    private String name;
    private int roll;
    private double marks;
    public String grade = "";

    public StudentDetails(String name,int roll,double marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }
    public void averageMarksAndGrade(int totalSub) {
        double average  = marks/totalSub;
       
        if(average >= 80 ) {
            grade = "A+";
        } 
        else if(average >= 70 && average < 80) {
            grade = "A";
        }
        else if(average >= 60 && average <70) {
            grade = "A-";
        }
        else if(average >= 50 && average <60) {
            grade = "B";
        }
        else {
            grade = "F";
        }
        showDetails(average);
    }
    void showDetails(double average){
        System.out.println("name : "+name);
        System.out.println("roll : "+roll);
        System.out.println("average marks : "+average);
        System.out.println("grade  : "+grade);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        StudentDetails s1 = new StudentDetails("sonok kanti", 112, 855.55);
        s1.averageMarksAndGrade(10);
    }
}

/*
Student Management
A Student class with name, roll number, and marks.  2 nd question of bacchader java oop 
*/
