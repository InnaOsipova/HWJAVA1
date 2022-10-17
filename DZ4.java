/*+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут 
быть заменены знаком вопроса, например 2? + ?5 = 69. 
Требуется восстановить выражение до верного равенства. 
Предложить хотя бы одно решение или сообщить, что его нет.*/

public class DZ4 {
    public static void main(String[] args) {
        String equation = "2? + ?5 = 69";
        //separation(equation);
        String [] arr1 = separation(equation);
        int [] arr = solution(arr1);
        System.out.println("Пропущенные числа : ");
        for (int i : arr) {
            System.out.printf("%d ", i);
            }
    }

    static String [] separation (String expression){
        System.out.println(expression);
        String rez = "";
        char [] m = expression.toCharArray();
        for (char c : m) {
            if (c != '+' && c != '='){
                rez = new StringBuilder(rez).append(Character.toString(c)).toString();
            }
        }
        String[] it = rez.split(" ");
        
        return it;
    }
    static int [] solution (String [] arr){
        int [] sol = new int [2];
        int codePoint = arr[0].codePointAt(0);
        char[] chars = Character.toChars(codePoint);
        String a = new String(chars);
        int codePoint1 = arr[2].codePointAt(1);
        char[] cha = Character.toChars(codePoint1);
        String b = new String(cha);
        int k = Byte.valueOf(arr[4]) - Integer.parseInt(a)*10 - Integer.parseInt(b);
        sol[0] = k % 10;
        sol[1] = (k - sol[0])/10;
        return sol;
        }
    
}
