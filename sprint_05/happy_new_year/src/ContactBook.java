import java.util.ArrayList;

// ограничьте класс ContactBook так, чтобы он мог хранить в себе только список контактов
class ContactBook<T> extends Contact {
    // объявите поле класса contacts — список контактов книги
    ArrayList<T> contacts;

    public void addContact(T contact) {
        contacts.add(contact);
    }
    ContactBook<T> contact;
    public ContactBook(String name) {
        super();
    }

    public ContactBook() {
        super();
    }

    public void print() {}

    public void sendMessage() {}

    public String getName() {
        return name;
    }

    public void printList() {
//  выведите на экран весь список контактов книги
        for (T contact : contacts.contains(name)) {

            System.out.println("Имя: " + сontact.getName());
            contact.print();
        }
    }
    public void congratulate(String name) {
        boolean contactPresented = false; // проверяем, есть ли контакт в базе
        // найдите контакт в книге по имени и отправьте ему сообщение с помощью метода sendMessage()
        if (contacts.contains(name)){
            contactPresented = true;
            System.out.println("Поздравим с Новым годом ваш контакт из записной книжки: " + name);

            contact.sendMessage();
        }// если контакт не найден, выведите соответствующее сообщение
        if (!contactPresented) {
            System.out.println("Не найден контакт с указанным именем.");
        }
    }
}