// дополните объявление класса Contact
public abstract class Contact {
    // класс должен содержать одно полe — имя пользователя name
    public final String name;

    // и два или три метода — getName(), sendMessage() для отправки сообщения и print() для печати информации о контакте
    public String getName(){
        return name;
    }
    public abstract void sendMessage();
    public abstract void print();
}