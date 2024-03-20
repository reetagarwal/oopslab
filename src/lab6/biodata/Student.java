package lab6.biodata;

public class Student implements Schooling,College{
    private String name;
    private String school;
    private String college;

    public Student(String name, String school, String college) {
        this.name = name;
        this.school = school;
        college = college;
    }

    public void schoolDetails(){
        System.out.println("School:"+school);
    }

    @Override
    public void collegeDetails() {
        System.out.println("College:"+college);
    }

    public void printDetails(){
        System.out.println("Name:"+name);
        schoolDetails();
        collegeDetails();
    }
}
