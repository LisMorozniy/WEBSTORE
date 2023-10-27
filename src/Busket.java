import java.util.ArrayList;
import java.util.List;

public class Busket {
    private List<Laptop> laptops = new ArrayList<>();
    private List<Mobile> mobiles = new ArrayList<>();
    private Buyer buyer;

    public Busket(Buyer buyer) {
        this.buyer = buyer;
    }

    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    public void addMobile(Mobile mobile) {
        mobiles.add(mobile);
    }

    public boolean checkout(Salesman salesman) {
        double total = 0;
        for (Laptop laptop : laptops) {
            if (!salesman.sellLaptop()) {
                return false;
            }
            total += laptop.getPrice();
        }
        for (Mobile mobile : mobiles) {
            if (!salesman.sellMobile()) {
                return false;
            }
            total += mobile.getPrice();
        }
        if (buyer.getBalance() < total) {
            System.out.println("Insufficient funds");
            return false;
        }
        buyer.setBalance(buyer.getBalance() - total);
        salesman.setBankAccount(salesman.getBankAccount() + (long) total);
        laptops.clear();
        mobiles.clear();
        return true;
    }
}
