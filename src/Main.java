public class Main {
    public static void main(String[] args) {
        //Задача 1
        int year = 1984;
        determinateLeapYear(year);

        //Задача 2
        int clientOS = 0;
        int clientDeviceYear = 2004;
        determinateVersionOS(clientOS, clientDeviceYear);

        //Задача 3
        int distance = 100;
        int deliveryDays = calculateDeliveryDays(distance);
        if (deliveryDays > 0) {
            System.out.println("Доставка займет " + deliveryDays + " дней");
        } else System.out.println("Доставки нет");
    }

    //Метод для задачи 1 - определение високосный год или нет
    static void determinateLeapYear(int year) {
        if (year >= 1584) {
            if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else System.out.println(year + " год не является високосным");
        } else System.out.println(year + " год не является високосным");
    }

    //Метод для задачи 2
    static void determinateVersionOS(int clientOS, int clientDeviceYear) {
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >=2015)
            System.out.println("Установите версию приложения для iOS по ссылке");
    }

//Метод для задачи 3
static int calculateDeliveryDays(int deliveryDistance) {

    if (deliveryDistance < 20) {
        return 1;
    } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
        return 2;
    } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
        return 3;
    } else {
        return (-1);
    }
}

}