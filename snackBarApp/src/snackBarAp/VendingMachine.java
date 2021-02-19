package snackBarAp;

public class VendingMachine {
    //filds = it knows
    private static int maxId = 0;
    private int id;
    private String name;

    //constructore
    public VendingMachine(String name)
    {
        maxId++;
        id = maxId;
        this.name = name;
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

     
}
