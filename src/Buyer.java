public class Buyer extends User {

    private CardType cardType;
    private String cardNumber;
    private double balance;

    public Buyer(String fio, Long iin, String contactNumber, CardType cardType, String cardNumber, double balance) {
        super(fio, iin, contactNumber);
        this.cardType = cardType;
        setCardNumber(cardNumber);
        this.balance = balance;
    }

    public CardType getCardType() {
        return cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        if (cardNumber.length() != 16) {
            System.out.println("Card number must be 16 digits long");
            return;
        }
        this.cardNumber = cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void changeNumber(String number) {
        // implementation
    }

    @Override
    public void changeFio(String fio) {
        // implementation
    }

    public void setBalance(double d) {
    }
    
}
