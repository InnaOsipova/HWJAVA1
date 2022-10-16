//Реализовать простой калькулятор
import java.util.Scanner;

public class DZ3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        Integer x = iScanner.nextInt();
        System.out.printf("Введите второе число: ");
        Integer y = iScanner.nextInt();
        Scanner iScanner1 = new Scanner(System.in);
        System.out.printf("Выбирите операцию +, -, *, / : ");
        String s = iScanner1.nextLine();
        System.out.println(calc(x, y, s));
        
    }

    static double calc (double num1, double num2, String simbol){

        double rezult = 0;
        

        if (simbol.indexOf("+") != (-1)){
            rezult = num1 + num2;
        }
        if (simbol.indexOf("-") != (-1)){
            rezult = num1 - num2;
        }
        if (simbol.indexOf("*") != (-1)){
            System.out.println(simbol);
            rezult = num1 * num2;
        }
        if (simbol.indexOf("/") != (-1)){
            rezult = num1 / num2;
        }

        
        return rezult;
    }
}
