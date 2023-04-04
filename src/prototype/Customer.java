package prototype;
public class Customer implements Cloneable {
    private String name;
    private String address;
    private String phone;

    public Customer(String name, String address, String phone) { //
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    private void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public Customer clone() throws CloneNotSupportedException {
        return (Customer) super.clone();
    }
}