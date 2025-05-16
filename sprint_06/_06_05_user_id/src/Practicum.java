import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Practicum {
    // private static List<User> users = new ArrayList<>();
    private static Map<Long, User> users = new HashMap<>();

    public static void main(String[] args) {
        // создадим 1 миллион пользователей
        for (long i = 1; i <= 1_000_000L; i++) {
            //users.add(new User(i, "Имя " + i));
            users.put(i, new User(i, "Имя " + i ));
        }

        final long startTime = System.nanoTime();
        User user = findUser(378_366L);
        final long endTime = System.nanoTime();

        System.out.println("Найден пользователь: " + user);
        System.out.println("Поиск занял " + (endTime - startTime) + " наносекунд.");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    private static User findUser(Long userId) {
        for (User user : users) {
            if (user.id.equals(userId)) {
                return user;
            }
        }

        return null;
    }

    static class User {
        Long id;
        String name;

        public User(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        public String toString() {
            return "User{id=" + id + ", name='" + name + "'}";
        }
    }
}