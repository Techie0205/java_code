public class student_1{
    int rollno;
    String name;
    double marks;

    void displayDetails(){
        System.out.println("name:"+ ""+ name );
        System.out.println("rollno:" +""+rollno );
        System.out.println("marks:" + ""+ marks);
    }  
    public static void main(String[] args){

        student s1 = new student();

        s1.rollno=1;
        s1.name="Harshita";
     
       s1.marks=86.8;
       s1.displayDetails();  
    }

}