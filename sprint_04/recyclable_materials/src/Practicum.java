import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Practicum {
    // объявите поле для ссылки на карту (англ. map link)
<<<<<<< HEAD
    ... = "https://recyclemap.ru/";
=======
    public static final String link = "https://recyclemap.ru/";
>>>>>>> 1b5f7cf (sprtint_04 end)
    public static final ArrayList<RecyclableMaterial> materials = getMaterials();
    public static final HashMap<MaterialType, String> containers = getContainers();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();
<<<<<<< HEAD

        String commandValue = scanner.nextLine();
        /* в зависимости от команды выполните следующие действия:
=======
        String commandValue = scanner.nextLine();
        switch (commandValue) {
            case "MAP":
                System.out.println(link);
                break;
            case "RECYCLABILITY":
                System.out.println("Введите код переработки:");
                int code = Integer.parseInt(scanner.nextLine());
                isRecycled(code);
                break;
            case "BONUS":
                System.out.println("Введите количество вторсырья, кг:");
                int weight = Integer.parseInt(scanner.nextLine());
                int bonus;
                if (weight < 10) {
                    bonus = weight * 10;
                } else {
                    bonus = weight * 15;
                }
                System.out.println("Количество бонусных баллов: " + bonus);
                break;
            default:
                System.out.println("Такой команды нет");
        }
                /* в зависимости от команды выполните следующие действия:
>>>>>>> 1b5f7cf (sprtint_04 end)
           map - вывести на экран ссылку на карту;
           recyclability - 1. напечатать сообщение "Введите код переработки:",
                           2. добавить ввод кода (целое число),
                           3. вызвать метод isRecycled;
           bonus - 1. напечатать сообщение "Введите количество вторсырья, кг:",
                   2. добавить ввод значения,
                   3. рассчитать бонус, умножив вес на коэффициент:
                       если вес меньше 10 кг, то коэффициент 10, иначе - 15,
                   4. вывести сообщение "Количество бонусных баллов: <баллы>."
        */

    }

    // добавьте модификаторы в заголовок метода
<<<<<<< HEAD
    ...  void isRecycled(int code) {
=======
    public static void isRecycled(int code) {
>>>>>>> 1b5f7cf (sprtint_04 end)
        for (RecyclableMaterial material : materials) {
            if (material.getCode() == code) {
                System.out.print("Это " + material.getDescription() + ". ");
                if (material.isRecyclable()) {
                    System.out.println("Положите его в контейнер с типом «" + containers.get(material.getType()) + "».");
                } else {
                    System.out.println("Он не подходит для вторичной переработки.");
                }
                return;
            }
        }
        System.out.println("Материал с таким кодом не найден.");
    }

    // добавьте модификаторы в заголовок метода
<<<<<<< HEAD
    ... HashMap<MaterialType, String> getContainers() {
=======
    public static HashMap<MaterialType, String> getContainers() {
>>>>>>> 1b5f7cf (sprtint_04 end)
        HashMap<MaterialType, String> containers = new HashMap<>();
        containers.put(MaterialType.PLASTIC, "Пластик");
        containers.put(MaterialType.METAL, "Металл");
        containers.put(MaterialType.GLASS, "Стекло");
        containers.put(MaterialType.PAPER, "Бумага");
        containers.put(MaterialType.UNSORTED_WASTE, "Общий мусор");

        return containers;
    }

    public static void printMenu() {
        System.out.println("Введите одну из команд: ");
        System.out.println(ChatCommand.MAP + " - посмотреть карту с пунктами приёма вторсырья.");
        System.out.println(ChatCommand.RECYCLABILITY + " - проверить по коду на упаковке, подходит ли материал для переработки.");
        System.out.println(ChatCommand.BONUS + " - рассчитать количество бонусных баллов.");
    }

    public static ArrayList<RecyclableMaterial> getMaterials() {
        ArrayList<RecyclableMaterial> materials = new ArrayList<>();

        materials.add(new RecyclableMaterial(1, MaterialType.PLASTIC, true, "полиэтилентерфталат"));
        materials.add(new RecyclableMaterial(2, MaterialType.PLASTIC, true, "полиэтилен высокой плотности"));
        materials.add(new RecyclableMaterial(3, MaterialType.PLASTIC, false, "поливинилхлорид"));
        materials.add(new RecyclableMaterial(4, MaterialType.PLASTIC, true, "полиэтилен низкой плотности"));
        materials.add(new RecyclableMaterial(5, MaterialType.PLASTIC, true, "полипропилен"));
        materials.add(new RecyclableMaterial(6, MaterialType.PLASTIC, false, "полистирол"));
        materials.add(new RecyclableMaterial(7, MaterialType.PLASTIC, false, "другие виды пластика"));
        materials.add(new RecyclableMaterial(20, MaterialType.PAPER, true, "гофрированный картон"));
        materials.add(new RecyclableMaterial(21, MaterialType.PAPER, true, "прочий картон"));
        materials.add(new RecyclableMaterial(22, MaterialType.PAPER, true, "бумага"));
        materials.add(new RecyclableMaterial(
                23, MaterialType.PAPER, false, "полиграфический картон (открытки, обложки книг и т.д.)"));
        materials.add(new RecyclableMaterial(40, MaterialType.METAL, true, "железо"));
        materials.add(new RecyclableMaterial(41, MaterialType.METAL, true, "алюминий"));
        materials.add(new RecyclableMaterial(70, MaterialType.GLASS, true, "бесцветное стекло"));
        materials.add(new RecyclableMaterial(71, MaterialType.GLASS, true, "зеленое стекло"));
        materials.add(new RecyclableMaterial(72, MaterialType.GLASS, true, "коричневое стекло"));
        materials.add(new RecyclableMaterial(73, MaterialType.GLASS, true, "бутылочное стекло (тёмно-коричневое)"));
        materials.add(new RecyclableMaterial(74, MaterialType.GLASS, true, "бутылочное стекло (светло-коричневое)"));
        materials.add(new RecyclableMaterial(75, MaterialType.GLASS, false, "стекло с малым содержанием свинца"));
        materials.add(new RecyclableMaterial(76, MaterialType.GLASS, false, "хрусталь"));
        materials.add(new RecyclableMaterial(
                77, MaterialType.GLASS, false, "стекло, покрытое медью (электроника, часы)"));
        materials.add(new RecyclableMaterial(
                78, MaterialType.GLASS, false, "стекло, покрытое серебром (зеркало, посуда для сервировки)"));
        materials.add(new RecyclableMaterial(
                79, MaterialType.GLASS, false, "позолоченное стекло (посуда для сервировки)"));

        return materials;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 1b5f7cf (sprtint_04 end)
