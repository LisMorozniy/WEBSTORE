public class Mobile implements Device {
    private String model;
    private double price;

    public Mobile(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void discount(int percent) {
        if (percent < 0 || percent > 100) {
            System.out.println("Invalid discount percent");
            return;
        }
        double discountAmount = price * percent / 100.0;
        price -= discountAmount;
    }
}