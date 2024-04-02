package MembershipProgram;

import java.util.Scanner;

public class Silver extends Membership{
    private double spent;

    public Silver(){
        super();
        spent = 0.0;
    }
    public Silver(double spent){
        super();
        this.spent = spent;
    }
    public Silver(String id, String name, String address, double spent){
        super(id, name, address);
        this.spent = spent;
    }
    public double getSpent(){
        return spent;
    }
    public void setSpent(double spent){
        this.spent = spent;
    }

    public double getGift(){
        double gift;
        if(spent > 50000 && spent < 100000){
            gift = 0.10;
        }else if(spent >= 100000){
            gift = 0.15;
        }else{
            gift = 0.0;
        }
        return spent * gift;
    }

    public String toString() {
        return super.toString()+ "\nShopping spent       : RP"+getSpent()
                +"\nEarned               : Gift with price <=RP"+getGift();
    }
    public static void member(Scanner get){
        Silver silver = new Silver();
        System.out.println("\n\n+================================================================+");
        System.out.println("|                  INPUT SILVER MEMBER ATTRIBUTE                 |");
        System.out.println("+================================================================+");
        System.out.print("Customer name      : ");
        get.nextLine();
        silver.setName(get.nextLine());
        System.out.print("Address            : ");
        silver.setAddress(get.nextLine());
        System.out.print("ID (9 digits)      : ");
        silver.setId(get.nextLine());
        System.out.print("Shopping spent     : RP");
        silver.setSpent(get.nextDouble());
        System.out.println("+================================================================+");
        System.out.println(silver);
    }
}
