//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class DZ1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int x = iScanner.nextInt();
        int [] sum = new int [x+1];
        int [] mult = new int [x+1];
        sum[1] = 0;
        //mult[1] =1;
        for (int i = 1; i <= x; i++) {
            mult[i] =1;
            for (int j = 1; j <= i; j++) {
                
                sum[i] += j;
                mult[i] *= j;
            }
            System.out.print(sum[i] + " ");
        }
        System.out.println();
        for (int i =  1; i <= x; i++) {
            System.out.print(mult[i] + " ");
        }
        
    }

    
}