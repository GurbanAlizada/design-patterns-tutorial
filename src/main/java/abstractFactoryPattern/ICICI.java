package abstractFactoryPattern;

class ICICI implements Bank{

    private final String BNAME;

    public ICICI(){
        BNAME="ICICI BANK created object ";
    }

    public String getBankName() {
        return BNAME;
    }

}