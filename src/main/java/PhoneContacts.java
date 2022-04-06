import java.util.*;

public class PhoneContacts {

    private HashMap<String, List<Contact>> storage = new HashMap<>();

    public boolean addGroup(String groupName) {
        // чтобы добавить группу, нужно добавить ключ и Пустой лист, проверяем, есть ли группа
        if (storage.containsKey(groupName)) {
            return false;
        }
        storage.put(groupName, new ArrayList<>());
        return true;
    }

    public boolean addContact(Contact contact, String[] groupNames) {
        for (String groupName : groupNames) {
            if (!storage.containsKey(groupName)) {
                return false;
            }
            // сначала запрашиваем список контактов по группе
            final List<Contact> groupContactList = storage.get(groupName);
            groupContactList.add(contact);
        }
        return true;

    }

    @Override
    public String toString() {
        // собираем строку размером 60 символов * на количество записей в хэшмапе
        StringBuilder sb = new StringBuilder(60 * storage.size());
        // проходим по всем записям
        for (Map.Entry<String, List<Contact>> groupContacts : storage.entrySet()) {
            sb
                    .append(groupContacts.getKey())
                    // отступаем строчку
                    .append("\n");
            // далее в цикле выводим контакты
            for (Contact contact : groupContacts.getValue()) {
                sb
                        // отступ от края
                        .append("\t")
                        // сам контакт
                        .append(contact)
                        // перевод строкиdf
                        .append("\n");

            }
        }
        // возвращаем стрингбилдер с построенной строкой
        return sb.toString();


    }

}