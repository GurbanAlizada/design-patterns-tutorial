package factoryPattern2;

public class Student extends User {


    @Override
    public void save(String name) {
        System.out.println("Student Saved  : " + name);
    }
}
