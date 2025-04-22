package test; // Оголошення пакету

import domain.Customer; // Імпорт класу Customer з пакету domain

public class CustomerTest { // Оголошення класу

    public static void main(String[] args) { // Головний метод для виконання
        // Створення об'єкта класу Customer
        Customer customer = new Customer();

        // Виклик методу displayCustomerInfo для цього об'єкта
        customer.displayCustomerInfo();
    }

}