import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toadEyesCount = 0;          //Жабьи глаза
        int ghoulTearsCount = 0;        //Слезы вурдалака
        int ravenBonesCount = 0;        //Кости ворона
        int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD ){
        boolean isCan = false;

        //todo реализовать ввод пользователем кол-ва ингредиентов.
        System.out.println("input ingridients: ");
        Scanner scn = new Scanner(System.in);
        System.out.println("Жабьи ");
        toadEyesCount = scn.nextInt();
        System.out.println("Слезы ");
        ghoulTearsCount = scn.nextInt();
        System.out.println("Кости ");
        ravenBonesCount = scn.nextInt();
        System.out.println("Пельмени ");
        dumplingsCount = scn.nextInt();


        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        //todo дописать логику программы сюда
        if (toadEyesCount >= 3 && ravenBonesCount >=1){
            System.out.println("Зоркость OK");
            isCan = true;
        }
        if (ravenBonesCount >=2 && dumplingsCount >=1) {
            System.out.println("Стойкость ОК");
            isCan = true;
        }
        if (ghoulTearsCount >= 7 && dumplingsCount >=1 && toadEyesCount >= 2){
            System.out.println("Скрытность ОК");
            isCan = true;
        }
        if (toadEyesCount >= 5 && dumplingsCount >=10 && toadEyesCount >=4 && ravenBonesCount >= 3){
            System.out.println("Запретный доступен!");
            isCan = true;
        } if (isCan == false) {
            System.out.println("No money no problem");
        }

    }
}
