public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        int i = 1;
        for (; i <= 10; i++) {
            System.out.println("i = " + i);
        }
        System.out.println(" ");
        System.out.println("Задание 2:");
        i = 10;
        for (;i >= 1; i-- ){
            System.out.println("i = " + i);
        }
        System.out.println(" ");
        System.out.println("Задание 3:");
        i = 0;
        for (; i < 17; i+=2){
            System.out.println("i = " + i);
        }
        System.out.println(" ");
        System.out.println("Задание 4:");
        i = 10;
        for (; i >= -10; i--){
            System.out.println("i = " + i);
        }
    }
}