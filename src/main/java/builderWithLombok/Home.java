package builderWithLombok;

import lombok.Builder;

import java.util.Date;


@Builder
public class Home {

    private int id ;
    private Date year;
    private String street;
    private int room;
    private int floatt;
    private int price;
    private String city;
    private String phoneNumber;
    private boolean enable;


    /*
    Builder-dan istifade ucun lombok kitabxanasini elave etmek kifayetdir .
     */

    public Home() {

    }

    public Home(int id, Date year, String street, int room, int floatt, int price, String city, String phoneNumber, boolean enable) {
        this.id = id;
        this.year = year;
        this.street = street;
        this.room = room;
        this.floatt = floatt;
        this.price = price;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.enable = enable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getFloatt() {
        return floatt;
    }

    public void setFloatt(int floatt) {
        this.floatt = floatt;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    @Override
    public String toString() {
        return "Home{" +
                "id=" + id +
                ", year=" + year +
                ", street='" + street + '\'' +
                ", room=" + room +
                ", floatt=" + floatt +
                ", price=" + price +
                ", city='" + city + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", enable=" + enable +
                '}';
    }
}
