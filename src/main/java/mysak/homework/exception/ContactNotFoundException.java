package mysak.homework.exception;

public class ContactNotFoundException extends Exception{
    public ContactNotFoundException(String phone) {
        super("Contact " + phone + " not found");
    }
}
