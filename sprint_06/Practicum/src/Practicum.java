import java.util.HashMap;
import java.util.Map;

public class Practicum {
    // Создадим хеш-таблицу для хранения заказов.
    // В качестве ключа будет имя клиента.
    // В качестве значения — количество заказов от этого клиента.
    private Map<String, Integer> orders = new HashMap<>();

    public static void main(String[] args) {
        Practicum pizzeria = new Practicum();
        pizzeria.openPizzeria();
        pizzeria.printStatistics();
    }

    // Начинаем принимать заказы! 🍕
    private void openPizzeria() {
        newOrder("Леонардо");
        newOrder("Донателло");
        newOrder("Рафаэль");
        newOrder("Леонардо");
        newOrder("Микеланджело");
        newOrder("Шреддер");
        newOrder("Донателло");
    }

    private void newOrder(String clientName) {
        // Сохраните новый заказ в хеш-таблицу. При обновлении счётчика заказов
        // не забудьте учесть заказы, которые уже были сделаны ранее.
        int countOrders;
        for(Map.Entry<String, Integer> order : orders.entrySet()) {
            if (orders.containsKey(clientName)) {
                countOrders = orders.get(clientName);
                countOrders++;
                orders.put(clientName, countOrders);
            } else {
                countOrders = 1;
                orders.put(clientName, countOrders);
            }
        }
    }

    private void printStatistics() {
        // Выведите собранную статистику в консоль и посчитайте общее количество заказов.
        //
        // Формат для вывода данных в консоль:
        //     Заказов от Микеланджело: 15
        //     Заказов от Леонардо: 4
        //     Всего заказов: 19

        for(Map.Entry<String, Integer> order : orders.entrySet()) {
            System.out.println("Заказаов от " + order.getKey() + ": " + orders.getOrDefault(order.getKey(), 0));
        }
    }
}