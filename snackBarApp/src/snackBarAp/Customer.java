package snackBarAp;

public class Customer {
    //fields
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    //costructor 
    public Customer(String name, double cashOnHand)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }
    //methods
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public double getCash()
    {
        return cashOnHand;
    }
    public void setCash(double cashOnHand) 
    {
        this.cashOnHand = cashOnHand;
    }
    public void addCash(double cashOnHand)
    {
        this.setCash(this.getCash() + cashOnHand);
    }
    public void buySnack(double cost)
    {
        this.setCash(this.getCash() - cost);
       
    }
}
