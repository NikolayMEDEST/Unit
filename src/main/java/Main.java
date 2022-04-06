import java.util.*;


public class Main {

    public static void main(String[] args) {
        Contacts contacts = new Contacts();
        MissedCalls missedCalls = new MissedCalls();

        fillContacts(contacts);
        fillMissedCalls(missedCalls);

        System.out.println(missedCalls.toString(contacts));
        missedCalls.clear();
        System.out.println("После очистки");
        System.out.println(missedCalls.toString(contacts));
    }

    private static void fillMissedCalls(MissedCalls missedCalls) {
        try (Scanner scanner = new Scanner(System.in)) {
            String tmInput = null;
            while (true) {
                System.out.println("Введите номер пропущенного или end ");
                tmInput = scanner.nextLine();
                if (tmInput.equals("end")) {
                    break;
                }
                missedCalls.addMissedCall(tmInput);
            }
        }
    }

    private static void fillContacts(Contacts contacts) {
        contacts.addContact(new Contact("Вася", "111"));
        contacts.addContact(new Contact("Петя", "222"));
        contacts.addContact(new Contact("Миша", "333"));
        contacts.addContact(new Contact("Женя", "444"));
        contacts.addContact(new Contact("Коля", "555"));
        contacts.addContact(new Contact("Саша", "666"));
        contacts.addContact(new Contact("Паша", "777"));

    }
}