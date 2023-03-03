package Seminar1;

public class Task2 {
//    Вывести все простые числа от 1 до 1000 ( 2 3 4 5 6 7 8 9   ///   7
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            if (simpleNumber(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean simpleNumber(int num){
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}


