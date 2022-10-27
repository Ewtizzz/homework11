import java.time.LocalDate;

public class Main {
    public static void visGod(int year){
        if (year % 4 == 0) {
            System.out.println("год " + year + " високосный");
        }else{
            System.out.println("год " + year + " не високосный");
        }
    }

    public static void osType(int type, int year){
        int currentYear = LocalDate.now().getYear();
        if (type == 0 && year < currentYear){
            System.out.println("установите облегченную версию для ios");

        }else if(type == 0 && year == currentYear){
            System.out.println("установите обычное приложение для ios");
        }else if (type == 1 && year < currentYear){
            System.out.println("установите облегченную версию для android");

        }else if(type == 1 && year == currentYear){
            System.out.println("установите обычное приложение для android");
        }
    }
    public static void getDate(int km){
        if (km <= 20){
            System.out.println("сутки");
        }else if (km > 20 && km <= 60){
            System.out.println("двое суток");
        }else if (km > 60 && km <=100){
            System.out.println("трое суток");
        }
    }
    public static void main(String[] args) {
        visGod(1988);
        osType(1,2022);
        getDate(60);

    }
}