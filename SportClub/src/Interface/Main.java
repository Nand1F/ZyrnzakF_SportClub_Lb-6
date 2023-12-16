package Interface;
import java.util.Scanner;
import logic.CommentManager;


/**
 * Клас Main представляє собою головну точку входу в програму для управління коментарями.
 */
public class Main {

    /**
     * Головний метод, де починається виконання програми.
     *
     * @param args Аргументи командного рядка (не використовуються в цій програмі).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("---Оберіть опцію:---");
            System.out.println("[1] Переглянути написані коментарі");
            System.out.println("[2] Написати коментар");
            System.out.println("[3] Вийти");

            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1:
                    System.out.println("Список коментарів:");
                    CommentManager.viewComments();
                    break;
                case 2:
                    System.out.println("Введіть ваше ім'я:");
                    String name = scanner.nextLine();
                    System.out.println("Введіть ваш коментар:");
                    String comment = scanner.nextLine();
                    CommentManager.addComment(name, comment);
                    break;
                case 3:
                    System.out.println("До побачення!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Некоректний вибір. Спробуйте ще раз.");
            }
        }
    }
}