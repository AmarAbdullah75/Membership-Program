package MembershipProgram;

import java.util.Scanner;

public class Gold extends Membership{
    protected double spent;

    public Gold(){
        super();
        spent = 0.0;
    }
    public Gold(double spent){
        super();
        this.spent = spent;
    }
    public Gold(String id, String name, String address, double spent){
        super(id, name, address);
        this.spent = spent;
    }
    public double getSpent(){
        return spent;
    }
    public void setSpent(double spent){
        this.spent = spent;
    }
    public double getDiscount(){
        double discount;
        if (spent > 50000 && spent < 100000){
            discount = 0.10;
        }else if(spent >= 100000){
            discount = 0.20;
        }else{
            discount = 0.0;
        }
        return spent * discount;
    }

    public String toString() {
        return super.toString()+ "\nShopping spent       : RP"+getSpent()
                +"\nEarned               : RP"+ getDiscount()+ " off discount ";
    }

    public static void member(Scanner get){
        Gold gold = new Gold();
        System.out.println("\n\n+================================================================+");
        System.out.println("|                   INPUT GOLD MEMBER ATTRIBUTE                  |");
        System.out.println("+================================================================+");
        System.out.print("Customer name      : ");
        get.nextLine();
        gold.setName(get.nextLine());
        System.out.print("Address            : ");
        gold.setAddress(get.nextLine());
        System.out.print("ID (9 digits)      : ");
        gold.setId(get.nextLine());
        System.out.print("Shopping spent     : RP");
        gold.setSpent(get.nextDouble());
        System.out.println("+================================================================+");
        System.out.println(gold);
    }
}
