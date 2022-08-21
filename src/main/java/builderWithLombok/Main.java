package builderWithLombok;

public class Main {

    public static void main(String[] args) {


        Home home = Home.builder()
                .id(1)
                .price(124)
                .city("Baku")
                .enable(true)
                .build();

        System.out.println(home);

    }


}
