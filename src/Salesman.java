public class Salesman extends User {
    private LegalType legalType;
    private long bankAccount;
    private Laptop[] laptops;
    private Mobile[] mobiles;
    private int soldLaptops = 0;
    private int soldMobiles = 0;

    public Salesman(String fio, Long iin, String contactNumber, LegalType legalType, long bankAccount, Laptop[] laptops, Mobile[] mobiles) {
        super(fio, iin, contactNumber);
        this.legalType = legalType;
        this.bankAccount = bankAccount;
        this.laptops = laptops;
        this.mobiles = mobiles;
    }

    public boolean sellLaptop() {
        if (soldLaptops >= laptops.length) {
            System.out.println("No more laptops to sell");
            return false;
        }
        soldLaptops++;
        return true;
    }

    public boolean sellMobile() {
        if (soldMobiles >= mobiles.length) {
            System.out.println("No more mobiles to sell");
            return false;
        }
        soldMobiles++;
        return true;
    }

    public void report() {
        System.out.println("Laptops sold: " + soldLaptops);
        System.out.println("Mobiles sold: " + soldMobiles);
        System.out.println("Bank account balance: " + bankAccount);
    }

    @Override
    public void changeNumber(String number) {
        this.contactNumber = number;
    }

    @Override
    public void changeFio(String fio) {
        this.fio = fio;
    }

    public long getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(long newBankAccount) {
        this.bankAccount = newBankAccount;
    }
}