import javax.swing.*;
import java.time.LocalDateTime;
import java.util.*;

public class MissedCalls {
    private static final int DEFAULT_LENGTH_PER_MISSED_CALL = 50;

    // TODO
    // добавить пропущенный
    // выводить пропущенный
    // очистить список
    // кладем в тримапу, т.к. нужна сортировка

    private Map<LocalDateTime, String> storage = new TreeMap<>();

    public void addMissedCall(String phone) {
        storage.put(LocalDateTime.now(), phone);
    }

    // для вывода не получится просто переопределить тустринг, т.к. нужны еще данные о контактах

    public String toString(Contacts contacts) {
        StringBuilder sb = new StringBuilder(DEFAULT_LENGTH_PER_MISSED_CALL * storage.size());
        // проходим по всем записям
        for (Map.Entry<LocalDateTime, String> entry : storage.entrySet()) {
            // заполняем данные о времени
            sb
                    .append(entry.getKey())
                    .append("\t");
            Contact target = contacts.getContact(entry.getValue());
            sb
                    .append(target == null ? entry.getValue() : target)
                    .append("\n");
        }
        return sb.toString();
    }

    public void clear() {
        storage.clear();
    }

}
