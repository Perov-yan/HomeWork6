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
        for (;i >= 1; i--){
            System.out.println("i = " + i);
        }
        System.out.println(" ");
        System.out.println("Задание 3:");
        i = 0;
        for (; i < 17; i += 2){
            System.out.println("i = " + i);
        }
        System.out.println(" ");
        System.out.println("Задание 4:");
        i = 10;
        for (; i >= -10; i--){
            System.out.println("i = " + i);
        }
        System.out.println(" ");
        System.out.println("Задание 5:");
        int year = 1904;
        for (;year <= 2096; year += 4){
            System.out.println( year + " год является високосным.");
        }
        System.out.println(" ");
        System.out.println("Задание 6:");
        i = 7;
        for (;i <= 98; i += 7){
            System.out.println("i = " + i);
        }
        System.out.println(" ");
        System.out.println("Задание 7:");
        i = 1;
        for (; i <= 512; i *= 2){
            System.out.println("i = " + i);
        }
        System.out.println(" ");
        System.out.println("Задание 8:");
        int totalMoney = 0;
        short moneyPerMount = 29000;
        i = 1;
        for (; i <= 12; i++){
            totalMoney = totalMoney + moneyPerMount;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalMoney + " рублей");
        }
        System.out.println(" ");
        System.out.println("Задание 9:");
        totalMoney = 0;
        moneyPerMount = 29000;
        int rate = 0;
        int month = 1;
        for (; month <= 12; month++){
            rate = (totalMoney / 100) * 1;
            totalMoney = totalMoney +rate + moneyPerMount;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalMoney + " рублей");
        }
        System.out.println(" ");
        System.out.println("Задание 10:");
        i = 1;
        int result = 0;
        for (; i <= 10; i++){
            result = 2 * i;
            System.out.println("2*"+ i + "="+ result);
        }
    }
}