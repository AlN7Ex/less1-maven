package mysak.homework.contacts;

public class Contact {
    private String name;
    private final String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "{" + "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
