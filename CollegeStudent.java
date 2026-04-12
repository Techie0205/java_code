class StudentParent{

    int rollNo=21;
    String name = "Harshita";

    void showStudentDetails(){
        System.out.println("roll no:" + rollNo + " " + name);
    }
}

public class CollegeStudent extends StudentParent{

    String collegeName= "GNC";

    void showCollegeDetails(){
        System.out.println("college name:"+ collegeName);
    }
    public static void main(String[] args){
        CollegeStudent cs = new CollegeStudent();
        cs.showStudentDetails();
        cs.showCollegeDetails();
    }
}