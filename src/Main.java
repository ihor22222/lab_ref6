/*public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкт класу Car
        Car myCar = new Car("Toyota Camry", "Petrol", "Ігор");

        // Відображаємо інформацію про автомобіль
        myCar.displayCarInfo();
    }
}/*
Для 2го завдання
 */



/*public class Main {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        MyData myData = new MyData(values);
        DataProcessor processor = new DataProcessor();
        processor.processData(myData);
    }
} для 3го завдання*/

public class Main {
    public static void main(String[] args) {
        // Створення об'єкту класу Account
        Account account = new Account();

        // Встановлення початкового балансу
        account.setBalance(1000);

        // Отримання поточного балансу
        double balance = account.getBalance();
        System.out.println("Поточний баланс: " + balance);

        // Зняття грошей з рахунку
        account.withdraw(500);

        // Отримання оновленого балансу
        balance = account.getBalance();
        System.out.println("Оновлений баланс: " + balance);
    }
}


