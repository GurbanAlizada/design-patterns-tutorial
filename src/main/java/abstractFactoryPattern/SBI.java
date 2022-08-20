package abstractFactoryPattern;

class SBI implements Bank{

    private final String BNAME;

    public SBI(){
        BNAME="SBI BANK created object";
    }


    public String getBankName(){
        return BNAME;
    }



}