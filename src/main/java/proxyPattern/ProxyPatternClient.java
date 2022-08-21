package proxyPattern;

public class ProxyPatternClient {


    public static void main(String[] args) {


        OfficeInternetAccess access = new ProxyInternetAccess("Leo Messi");
        access.grantInternetAccess();

    }

}
