package Explore_Objects;

public class Student {
    
    private String id;
    private String firstname;
    private String lastname;
    private int age;

    public Student() {
        
    }

    public Student (String id, String firstname, String lastname, int age) {

        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;

    }

    public String getId() {

        return this.id;

    }

    public String getfirstname() {

        return this.firstname;

    }

    public String getlastname() {

        return this.lastname;

    }

    public int getage() {

        return this.age;

    }

    public void setId(String id) {

        this.id = id;

    }

    public void setfirstname(String id) {

        this.firstname = firstname;

    }

    public void setlastname(String id) {

        this.lastname = lastname;

    }

    public void setage(int id) {

        this.age = age;

    }

    public String showFULLName(Student student) {

        return student.getfirstname() + " " + student.getlastname();

    }

}
