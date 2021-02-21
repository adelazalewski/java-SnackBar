package snackBarAp;

public class Snack {
    //fiends = it knows
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    //constructor = we instanciate
    public Snack(String name, int quantity, double cost, int vendingMachineId) {
        maxId++;
        id = maxId;
        //send the initial state
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }
    //methods
    public int getId()
    {
        return id;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public double getCost()
    {
        return cost;
    }
    public void setCost(double cost)
    {
        this.cost = cost;
    }
    public int getVendingMachineId()
    {
        return vendingMachineId;
    }
    public void setVendingMachineId(int vendingMachineId)
    {
        this.vendingMachineId = vendingMachineId;
    }
    public int addQunatity(int quatity)
    {
        this.quantity = this.quantity + quatity;
        return getQuantity();
    }
    public int buySnack(int quantity)
    {
        this.quantity = this.quantity - quantity;
        return this.quantity;
    }
    public double getTotal(int quantity)
    { 
        this.cost = this.cost * quantity;
        return this.cost;
    }
}
