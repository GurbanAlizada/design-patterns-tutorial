package abstractFactoryPattern;

class HDFC implements Bank{


    private final String BNAME;

    public HDFC(){
        BNAME="HDFC BANK created object";
    }

    public String getBankName() {
        return BNAME;
    }


}