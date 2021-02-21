package snackBarAp;
import java.text.DecimalFormat;

public class Main {
    private static DecimalFormat df = new DecimalFormat("$#,##0.00");
        private static void workWithData()
        {
            System.out.println("welcome to snack bar java");

            //add objects
            Customer c1 = new Customer("Jane", 45.25);
            Customer c2 = new Customer("Bob", 33.14);

            VendingMachine food = new VendingMachine("Food");
            VendingMachine drink = new VendingMachine("Drink");
            VendingMachine office = new VendingMachine("Office");

            Snack s1 = new Snack("chips", 36, 1.75, food.getId());
            Snack s2 = new Snack("chocolate bar", 36, 1.00, food.getId());
            Snack s3 = new Snack("pretzel", 30, 2.00, food.getId());
            Snack s4 = new Snack("soda", 24, 2.50, drink.getId());
            Snack s5 = new Snack("Water", 20, 2.75, drink.getId());

            System.out.println();

            String cash = "cash on hand";
            String quantity = "Quantity of";

            s4.buySnack(3); //21
            //s4.getTotal(3); //3 x 2.50 = 7.50
            c1.buySnack(s4.getTotal(3));
            System.out.println(c1.getName() + cash + df.format(c1.getCash()));
            System.out.println(quantity + s4.getName() + "is" + s4.getQuantity());
            
            System.out.println();

            s3.buySnack(1);
            c1.buySnack(s3.getTotal(1));
            System.out.println(c1.getName() + cash + df.format(c1.getCash()));
            System.out.println(quantity + s3.getName() + "is" + s3.getQuantity());

            System.out.println();

            s4.buySnack(2);
            c2.buySnack(s4.getTotal(2));
            System.out.println(c2.getName() + cash + df.format(c2.getCash()));
            System.out.println(quantity + s4.getName() + "is" + s4.getQuantity());

            System.out.println();

            c1.addCash(10.00);
            System.out.println(c1.getName() + cash + df.format(c1.getCash()) );

            System.out.println();

            s2.buySnack(1);
            c1.buySnack(s2.getTotal(1));
            System.out.println(c1.getName() + cash + df.format(c1.getCash()));
            System.out.println(quantity + s2.getName() + "is" + s2.getQuantity());

            System.out.println();

            s3.addQunatity(12);
            System.out.println(quantity + s3.getName() + s3.getQuantity());

            System.out.println();

            s3.buySnack(3);
            c2.buySnack(s3.getTotal(3));
            System.out.println(c2.getName() + cash + df.format(c2.getCash()));
            System.out.println(quantity + s3.getName() + "is" + s3.getQuantity());

            System.out.println();

            String str = "Vending Machine: ";
            String snack = "Snack :";
            String quan = "Quantity: ";
            String total = "Total Cost: ";

            System.out.println(snack + s1.getName() + "," + str+ food.getName() + "," + quan + s1.getQuantity() + "," + total + df.format(s1.getTotal(s1.getQuantity())));

            System.out.println(snack + s2.getName() + "," + str+ food.getName() + "," + quan + s2.getQuantity() + "," + total + df.format(s2.getTotal(s2.getQuantity())));

            System.out.println(snack + s3.getName() + "," + str+ food.getName() + "," + quan + s3.getQuantity() + "," + total + df.format(s3.getTotal(s3.getQuantity())));

            System.out.println(snack + s4.getName() + "," + str+ drink.getName() + "," + quan + s4.getQuantity() + "," + total  + df.format(s4.getTotal(s4.getQuantity())));
            
            System.out.println(snack + s5.getName() + "," + str  + drink.getName() + "," + quan + s5.getQuantity() + "," + total + df.format(s5.getTotal(s5.getQuantity())));
        }
        public static void main(String[] args)
        {
            workWithData();
    
        }
}