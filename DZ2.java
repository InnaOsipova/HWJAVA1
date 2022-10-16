//Вывести все простые числа от 1 до 1000
import java.util.Scanner;


public class DZ2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n от 1 до 1000: ");
        Integer x = iScanner.nextInt();
        String rez = x.toString(x) + " = " ;
        int i = 2;
        while (i <= x) {
            if (isPrime(i) == true && x%i ==0){
                rez = new StringBuilder(rez).append(i).append("*").toString();
                x /=i;
            }
            else i += 1;
        }
        int deletePoz = rez.length();
        StringBuffer sb = new StringBuffer(rez);
        sb.delete(deletePoz-1,deletePoz); 
        System.out.print(sb);
            
        
    }
  
    static boolean isPrime (int n){
        if (n == 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
