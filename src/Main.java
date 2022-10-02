import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        checkYear(2022);
        //Задание 2
        int clientDeviceYear = 2022, clientOS = 1;
        checkDevice(clientOS, clientDeviceYear);
        //Задание 3
        int distance = 65;
        checkDeliveryTime(distance);
    }
    public static void checkYear(int year) {
        boolean isNoLeap = year % 100 == 0 && year % 400 != 0, isLeap = year % 4 == 0;
        if (isLeap && !isNoLeap) {
            System.out.println(year + " - год високосный");
        } else {
            System.out.println(year + " - год не високосный");
        }
    }
    public static void checkDevice(int clientOS, int clientDeviceYear){
        String text = "Установите облегченную версию приложения для iOS по ссылке";
        if (clientDeviceYear == LocalDate.now().getYear()) {
            text = text.replace("облегченную ", "");
        }
        if (clientOS == 1) {
            text = text.replace("iOS", "Android");
        }
        System.out.println(text);
    }

    public static void checkDeliveryTime(int distance) {
        int deliveryTime = 0;
        for (int i = -20; distance > i; i+=40) {
            deliveryTime++;
        }
        System.out.println("Потребуется дней: " + deliveryTime);
    }
}