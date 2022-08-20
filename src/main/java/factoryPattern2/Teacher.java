package factoryPattern2;

public class Teacher extends User{


    @Override
    public void save(String name) {
        System.out.println("Teacher Saved : " + name );
    }
}
