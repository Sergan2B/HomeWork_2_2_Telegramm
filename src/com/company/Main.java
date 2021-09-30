package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Создать возвращаемый метод который будет принимать 2 входящих параметра - возраст человека и температуру на улице, и возвращать результат в виде строки.
        //Алгоритм метода должен работать следующим образом:
        //если возраст человека от 20 до 45 лет и температура на улице от -20 до 30 градусов, то возвращаемый результат - “Можно идти гулять”;
        //если же человеку меньше 20 лет и температура на улице в диапазоне от 0 до 28 градусов, то результат снова - “Можно идти гулять”;
        //а если человеку больше 45 лет, то результат “Можно идти гулять” формируется только тогда когда на улице температура в диапазоне от -10 до 25 градусов;
        //В остальных случаях метод должен возвращать результат - “Оставайтесь дома”;
        //В методе main вызвать написанный метод 5 раз с различными входными данными (аргументами) и распечатать результат в консоль.
        int resultRandomAgeAndTemperature = generateRandomAgeTemperature(1,1 );
        int resultRandomAgeAndTemperature1 = generateRandomAgeTemperature(1,1 );
        int resultRandomAgeAndTemperature2 = generateRandomAgeTemperature(1,1 );
        int resultRandomAgeAndTemperature3 = generateRandomAgeTemperature(1,1 );
        int resultRandomAgeAndTemperature4 = generateRandomAgeTemperature(1,1 );

    }
    //ДЗ на сообразительность:
    //Написать метод в котором генерируется случайный возраст public static int generateRandomAge(){........}
    //При вызове метода, который формирует результат “можно ли идти гулять” использовать генерирование случайного возраста с помощью метода “generateRandomAge”
    public static int generateRandomAgeOne(){
        int ageOfHuman = (int) (Math.random() * 70);
        System.out.println("Случайны возраст равен " + ageOfHuman);
        return ageOfHuman;
    }
    public static int generateRandomAgeTemperature(int ageOfHuman, int temperature){
        Scanner enterAgeOfHuman, enterTemperature, enterNumber;
        enterNumber = new Scanner(System.in);
        System.out.println("Введите число 1, если хотите сами внести возраст и температуру самостоятельно. Введите число 2, если хотите чтобы возраст был случайным.");
        int number = enterNumber.nextInt();
        switch (number) {
            case 1:
                enterAgeOfHuman = new Scanner(System.in);
                System.out.println("Введите возраст человека: ");
                ageOfHuman = enterAgeOfHuman.nextInt();
                enterTemperature = new Scanner(System.in);
                System.out.println("Введите температуру на улице: ");
                temperature = enterTemperature.nextInt();
                break;
            case 2:
                ageOfHuman = generateRandomAgeOne();
                enterTemperature = new Scanner(System.in);
                System.out.println("Введите температуру на улице: ");
                temperature = enterTemperature.nextInt();
                System.out.println("Случайный возраст равен = " + ageOfHuman + ". Температура равна =  " + temperature + ".");
                break;
            default:
                System.out.println("Вы ввели неправильный набор. Попробуйте еще.");
                int resultRandomAgeAndTemperature = generateRandomAgeTemperature(1,1 );
                break;
        }
        if (ageOfHuman > 20 && ageOfHuman < 45 && temperature > -20 && temperature < 30) System.out.println("Можно идти гулять");
        else if (ageOfHuman < 20 && temperature > 0 && temperature < 28) System.out.println("Можно идти гулять");
        else if (ageOfHuman > 45 && temperature > -10 && temperature < 25) System.out.println("Можно идти гулять");
        else System.out.println("Оставайтесь дома");
        return ageOfHuman + temperature;
    }
}
