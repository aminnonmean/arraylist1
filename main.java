import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        todolist list = new todolist();
        String funcs = "\nВыберите операцию:\n" +
                "0. Выход из программы\n" +
                "1. Добавить дело\n" +
                "2. Показать дела\n" +
                "3. Удалить дело по номеру\n" +
                "4. Удалить дело по названию\n" +
                "5. Удалить задачи по слову";

        boolean iscont = true;
        while (iscont) {
            System.out.println(funcs);
            int choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 0:
                    iscont = false;
                    break;
                case 1:
                    System.out.println("Введите название задачи: ");
                    list.add(sc.nextLine());
                    break;
                case 2:
                    list.print();
                    break;
                case 3:
                    System.out.println("Введите номер задачи для удаления: ");
                    list.deleteByNum(Integer.parseInt(sc.nextLine()));
                    break;
                case 4:
                    System.out.println("Введите текст задачи для удаления: ");
                    list.deleteByText(sc.nextLine());
                    break;
                case 5:
                    System.out.println("Введите слово: ");
                    list.delByKeyword(sc.nextLine());
                    break;
                default:
                    System.out.println("Вы ввели номер операции некорректно!");
                    break;
            }
        }
    }
}
