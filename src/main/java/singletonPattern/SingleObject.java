package singletonPattern;

public final class SingleObject {

    private static SingleObject instance = new SingleObject();

    private SingleObject(){

    }

    public static SingleObject getInstance(){

        if (instance == null){
            instance = new SingleObject();

        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }


}