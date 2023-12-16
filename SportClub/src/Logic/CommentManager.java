package logic;
import java.io.*;
import Interface.Main;

/**
 * Клас CommentManager відповідає за управління коментарями.
 */
public class CommentManager {
    private static final String FILE_NAME = "comments.txt";

    /**
     * Метод для перегляду існуючих коментарів, збережених у файлі.
     */
    public static void viewComments() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
            String line;


            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println("------------------------");
            reader.close();
        } catch (IOException e) {
            System.out.println("Помилка при зчитуванні коментарів: " + e.getMessage());
        }
    }

    /**
     * Метод для додавання нового коментаря разом із іменем користувача.
     *
     * @param name    Ім'я користувача, яке буде включено в коментар.
     * @param comment Текст коментаря, який користувач додає.
     */
    public static void addComment(String name, String comment) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true));


            writer.write("------------------------");
            writer.newLine();
            writer.write(name + ": " + comment);
            writer.newLine();
            writer.close();

            System.out.println("Коментар успішно додано!");
        } catch (IOException e) {
            System.out.println("Помилка при додаванні коментаря: " + e.getMessage());
        }
    }
}
