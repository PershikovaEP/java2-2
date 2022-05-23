public class Main {
    public static void main(String[] args) {

        int startAmount = 300; // начальный счёт
        int sum = 701; // сумма пополнения

        int amount = startAmount + sum; //сумма после пополнения

        int bonus;
        int endAmount;

        if (amount > 1000) {
            bonus = amount / 100;
            endAmount = bonus + amount;
            System.out.println("Клиент пополнил счет на " + sum + " рублей - бонус равен " + bonus + " рубля(ям), итоговая сумма на счету клиента - " + endAmount + " рублей");
        } else {
            endAmount = amount;
            System.out.println("Клиент пополнил счет на " + sum + " рублей - бонусов нет, итоговая сумма на счету клиента - " + endAmount + " рублей");
        }
    }
}
