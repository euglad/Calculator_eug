package com.company;
import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num_1 = getNum();
        int num_2 = getNum();
        char operation = getOperation();
        int result = calculator(num_1,num_2,operation);
        System.out.println("Результат = "+result);
    }

    public static int getNum(){
        System.out.println("Число:");
        int num;
        String num_rom_arab = scanner.nextLine();
        switch (num_rom_arab){
            case ("I"):
                num = 1;
                break;
            case "II":
                num = 2;
                break;
            case "III":
                num = 3;
                break;
            case "IV":
                num = 4;
                break;
            case "V":
                num = 5;
                break;
            case "VI":
                num = 6;
                break;
            case "VII":
                num = 7;
                break;
            case "VIII":
                num = 8;
                break;
            case "IX":
                num = 9;
                break;
            case "X":
                num = 10;
                break;
            case "0":
                num = 0;
                break;
            case "1":
                num = 1;
                break;
            case "2":
                num = 2;
                break;
            case "3":
                num = 3;
                break;
            case "4":
                num = 4;
                break;
            case "5":
                num = 5;
                break;
            case "6":
                num = 6;
                break;
            case "7":
                num = 7;
                break;
            case "8":
                num = 8;
                break;
            case "9":
                num = 9;
                break;
            case "10":
                num = 10;
                break;
            default:
                System.out.println("Число не вірне, повторіть введення числа.");
                num = getNum();
        }
        return num;
    }


    public static char getOperation(){
        System.out.println("Введіть арифметичну операцію: ");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Операція не вірна, повторіть введення операції.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calculator(int num_1, int num_2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num_1+num_2;
                break;
            case '-':
                result = num_1-num_2;
                break;
            case '*':
                result = num_1*num_2;
                break;
            case '/':
                if (num_2 == 0)
                {System.out.println("Ділення на 0 неприпустиме в полі натуральним чисел.");
                result = calculator(num_1, num_2, getOperation());}
                else
                {result = num_1/num_2;}
                break;
            default:
                System.out.println("Операція не вірна, повторіть введення операції.");
                result = calculator(num_1, num_2, getOperation());
        }
        return result;
    }
}
