package domain;

public class Customer {

    private int ID = 1;
    private boolean isNew = true;
    private double total = 1000.0;

    // Метод для виведення інформації про клієнта
    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + ID); // Виводимо ID
        System.out.println("Is New: " + isNew);   // Виводимо статус новизни
        System.out.println("Total Purchases: " + total); // Виводимо загальну суму
    }

}