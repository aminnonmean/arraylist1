import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class todolist {
    List<String> list = new ArrayList<>();
    Iterator<String> iterator= list.iterator();


    public void print(){
        /*while (iterator.hasNext()){
            String s1 = iterator.next();
            System.out.println(iterator.next());
            int a = list.indexOf(s1);
            System.out.printf("%d) %s", a, s1);*/
        System.out.println("Ваши дела:");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d) %s\n", i+1, list.get(i));
        }
    }

    public void add(String s){
        list.add(s);
        System.out.println("Добавлено!");
        this.print();
    }

    public void deleteByNum(int n) {
        list.remove(n-1);
        System.out.println("Удалено!");
        this.print();
    }

    public void deleteByText(String s) {
        if (list.remove(s)){
            System.out.println("Удалено!");
            this.print();
        } else {
            System.out.println("Нет такого дела!");
        }
    }
    public void delByKeyword(String s) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).toLowerCase().contains(s.toLowerCase())) {
                list.remove(i);
                i--;
            }
        }
        this.print();
    }
}
