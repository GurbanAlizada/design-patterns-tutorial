package factoryPattern2;

public class Main {
    public static void main(String[] args) {

        UserFactory userFactory = new UserFactory();

        User user1 = userFactory.createUser(UserType.STUDENT);
        user1.save("Anna");

        User user2 = userFactory.createUser(UserType.TEACHER);
        user1.save("Rio");



    }
}
