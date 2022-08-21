package prototypePattern3;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        User user1 =  new User(1, "changed" , "changed");
        User user2 = user1.clone();

        System.out.println(user1);
        System.out.println(user2);




    }
}
