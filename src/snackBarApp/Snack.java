package snackBarApp;

public class Snack {

    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int machineId;

    public Snack(String name, int quantity, double cost, int machineId) {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.machineId = machineId;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return cost;
    }

    public int getMachineId() {
        return machineId;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    // methods

    public void addSnack(int added) {
        this.quantity = this.quantity + added;
    }

    public void buySnack(int num) {
        this.quantity = this.quantity - num;
    }

    public double totalCost() {
        return quantity * cost;
    }

}