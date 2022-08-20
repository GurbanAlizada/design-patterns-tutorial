package factoryPattern2;

public class UserFactory {


    public User createUser(UserType userType){

        if(userType == UserType.STUDENT){
            return new Student();
        }else if(userType == UserType.TEACHER){
            return new Teacher();
        }



        return null;
    }


}
