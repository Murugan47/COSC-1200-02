package Explore_Objects;

public class ExploreObjects {

    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.setfirstname("John");
        s1.setlastname("Smith");
        s1.setage(22);
        s1.setId("1");

        System.out.println( s1.getfirstname() + s1.getlastname() + s1.getage() + s1.getId() );

    }

}