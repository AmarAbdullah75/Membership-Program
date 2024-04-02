package MembershipProgram;

import java.util.Scanner;

public class Bronze extends Membership{
    private double spent;

    public Bronze(){
        super();
        spent = 0.0;
    }
    public Bronze(double spent){
        super();
        this.spent = spent;
    }
    public Bronze(String id, String name, String address, double spent){
        super(id, name, address);
        this.spent = spent;
    }
    public double getSpent(){
        return spent;
    }
    public void setSpent(double spent){
        this.spent = spent;
    }
    public String getCoupont(){
        return spent < 100000 ? "RP5% off Shopping Coupont":
                "RP10% off Shopping Coupont";
    }

    public String toString() {
        return super.toString()+ "\nShopping spent       : RP"+getSpent()
                +"\nEarned               : "+getCoupont();
    }
    public static void member(Scanner get){
        Bronze bronze = new Bronze();
        System.out.println("\n\n+================================================================+");
        System.out.println("|                  INPUT BRONZE MEMBER ATTRIBUTE                 |");
        System.out.println("+================================================================+");
        System.out.print("Customer name      : ");
        get.nextLine();
        bronze.setName(get.nextLine());
        System.out.print("Address            : ");
        bronze.setAddress(get.nextLine());
        System.out.print("ID (9 digits)      : ");
        bronze.setId(get.nextLine());
        System.out.print("Shopping spent     : RP");
        bronze.setSpent(get.nextDouble());
        System.out.println("+================================================================+");
        System.out.println(bronze);
    }
}
