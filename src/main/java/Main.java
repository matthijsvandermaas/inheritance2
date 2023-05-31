import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        CustomerList customerList = new CustomerList();

        String customerLastName1 = "van der Maas";
        String customerFirstName1 = "Matthijs";
        int customerNumber1 = 1;

        String customerLastName2 = "klipper";
        String customerFirstName2 = "flipje";
        int customerNumber2 = 2;

        customerList.addCustomer(customerFirstName1, customerLastName1, customerNumber1);
        customerList.addCustomer(customerFirstName2, customerLastName2, customerNumber2);
        customerList.printCustomers();
    }

    public static class CustomerList {
        private HashMap<Integer, Customer> customers;

        public CustomerList() {
            customers = new HashMap<>();
        }

        public void addCustomer(String firstName, String lastName, int number) {
            Customer customer = new Customer(firstName, lastName, number);
            customers.put(number, customer);
        }

        public void printCustomers() {
            for (Customer customer : customers.values()) {
                System.out.println(customer.getName());
            }
        }
    }

    public static class Customer {
        private String firstName;
        private String lastName;
        private int number;

        public Customer(String firstName, String lastName, int number) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.number = number;
        }

        public String getName() {
            return number + " " + firstName + " " + lastName;
        }
    }
}
