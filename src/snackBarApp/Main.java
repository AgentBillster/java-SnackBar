package snackBarApp;

public class Main {

    private static void doSomeWork() {

        Customer c1 = new Customer("Jane", 45);
        Customer c2 = new Customer("Bob", 33);

        VendingMachine v1 = new VendingMachine("Food Vending Machine");
        VendingMachine v2 = new VendingMachine("Drink Vending Machine");
        VendingMachine v3 = new VendingMachine("Office Vending Machine");

        Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
        Snack s2 = new Snack("Chocolate Bar", 36, 1, v1.getId());
        Snack s3 = new Snack("Pretzel", 30, 2, v1.getId());

        Snack s4 = new Snack("Soda", 36, 1.75, v2.getId());
        Snack s5 = new Snack("Water", 36, 1.75, v2.getId());

        c1.buySnack(s1.getCost() * 3);
        s4.buySnack(3);
        System.out.println(c1.getName() + " has " + "$" + c1.getCashOnHand() + " left. " + "There are " + s4.getQuantity() + " " + s4.getName() + "s left.");

        c1.buySnack(s3.getCost() * 3);
        s3.buySnack(3);
        System.out.println(c1.getName() + " has " + "$" + c1.getCashOnHand() + " left. " + "There are " + s3.getQuantity() + " " + s3.getName() + "s left.");


        c2.buySnack(s2.getCost() * 2);
        s2.buySnack(2);
        System.out.println(c2.getName() + " has " + "$" + c2.getCashOnHand() + " left. " + "There are " + s2.getQuantity() + " " + s2.getName() + "s left.");



    }

    public static void main(String[] args) {
        doSomeWork();
    }

}