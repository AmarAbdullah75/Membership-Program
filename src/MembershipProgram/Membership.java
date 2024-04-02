package MembershipProgram;

import java.util.Scanner;

public class Membership {
    private String id;
    private String name;
    private String address;

    public Membership() {

    }

    public Membership(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public String getId() {
        return id.substring(0, 3) + "-" + id.substring(3, 5) + "-" + id.substring(5, id.length());
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String toString() {
        return "Customer Member      : " + name + " (" + address + ")" +
                "\nMembership ID        : " + getId();
    }
    public static void App(){
        Scanner get = new Scanner(System.in);
        short menu;
        do {
            System.console();
            System.out.println("\n\n+================================================================+");
            System.out.println("|                     MEMBERSHIP APPLICATION                     |");
            System.out.println("+================================================================+");
            System.out.println("1. Bronze Membership");
            System.out.println("2. Silver Membership");
            System.out.println("3. Gold Membership");
            System.out.println("4. Super Gold Membership");
            System.out.println("5. Exit");
            System.out.println("+================================================================+");
            System.out.print("Choose [1-5] :");
            menu = get.nextShort();
            switch (menu){
                case 1:Bronze.member(get);
                    break;
                case 2:Silver.member(get);
                    break;
                case 3:Gold.member(get);
                    break;
                case 4:SuperGold.member(get);
                    break;
                case 5:System.exit(0);
                default:break;
            }
        }while(menu != 5);
    }
}
