import java.util.HashMap;
import java.util.Map;


public class Contacts {

    // добавить контакт
    // получить контакт по телефону
    private Map<String, Contact> storage = new HashMap<>();

    public void addContact(Contact contact) {
        storage.put(contact.getPhoneNumber(), contact);
    }

    public Contact getContact(String phone) {
        return storage.get(phone);
    }

}