import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        divide();
        System.out.println();
        rename();
        System.out.println();
        findMax();
        System.out.println();
        countDistinct();
    }
    static void divide(){
        System.out.println("1. Фільтрація парних чисел: Напишіть метод який вертає ліст чисел які діляться на 3.\n" +
                "   Вхідний ліст Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10):");
        List <Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List <Integer> dividedByThree = nums.stream().filter(num -> num % 3 == 0).toList();
        System.out.println(dividedByThree);
    }
    static void rename(){
        System.out.println("2. Перетворення імен імена написані великими літерами: Напишіть метод який вертає ліст імен з великої букви.\n" +
                "    Використовуйте метод map. Вхідний ліст Arrays.asList(\"john\", \"sarah\", \"tom\")");
        List <String> names = Arrays.asList("john", "sarah", "tom");
        List <String> namesUpper = names.stream().map(name -> name.toUpperCase()).toList();
        System.out.println(namesUpper);
    }

    static void findMax(){
        System.out.println("3. Пошук максимального значення: Напишіть метод який вертає максимальне значення з заданого списку цілих чисел.\n" +
                "         Використовуйте метод reduce.  Arrays.asList(1, 2, 3, 3, 4, 5, 5, 5, 6):");
        List<Integer> numList = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 5, 6);
        Integer max = numList.stream().reduce(0, (a, b) -> Integer.max(a, b));
        System.out.println(max);
    }

    static void countDistinct(){
        System.out.println(" 4. Підрахунок унікальних елементів: Напишіть метод який вертає кількість унікальних елементів у списку.\n" +
                "         Використовуйте метод distinct.:");
        List<Integer> numsList = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 5, 6);
        Long numsUnique = numsList.stream().distinct().count();
        System.out.println(numsUnique);
    }
}