package MembershipProgram;

import java.util.Scanner;

public class SuperGold extends Gold{
    public SuperGold(){
        super();
    }
    public SuperGold(double spent){
        super(spent);
    }
    public SuperGold(String id, String name, String address, double spent){
        super(id, name, address, spent);
    }

    public double getPoint(){
        double point;
        if(spent > 50000 && spent < 100000){
            point = 1;
        }else if(super.spent >= 100000){
            point = (spent / 50000) + 10;
        }else{
            point = 0.0;
        }
        return point;
    }

    public String toString() {
        return super.toString()+getPoint() + " point.";
    }

    public static void member(Scanner get){
        SuperGold superGold = new SuperGold();
        System.out.println("\n\n+================================================================+");
        System.out.println("|                INPUT SUPER GOLD MEMBER ATTRIBUTE               |");
        System.out.println("+================================================================+");
        System.out.print("Customer name      : ");
        get.nextLine();
        superGold.setName(get.nextLine());
        System.out.print("Address            : ");
        superGold.setAddress(get.nextLine());
        System.out.print("ID (9 digits)      : ");
        superGold.setId(get.nextLine());
        System.out.print("Shopping spent     : RP");
        superGold.setSpent(get.nextDouble());
        System.out.println("+================================================================+");
        System.out.println(superGold);
    }
}
