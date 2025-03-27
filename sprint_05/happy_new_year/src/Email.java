import java.util.List;
// унаследуйте класс от базового класса, описывающего контакт Contact
class Email extends ContactBook {
    private final String email;

    public Email(String name, String email) {
        super(name);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    // метод sendMessage переопределяет метод базового класса

    public void sendMessage() {
        System.out.println("Отправим новогоднюю картинку коллеге на электронную почту " + email);
    }


    public void print() {
        System.out.println("Email: " + getEmail());
    }
}