package singletonPattern;

public class Main {
    public static void main(String[] args) {

        SingleObject object = SingleObject.getInstance();

        object.showMessage();


    }
}
