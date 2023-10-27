public class App { public static void main(String[] args) {

        // Создаем продавца и заполняем "склад"
        Laptop[] laptops = new Laptop[5];
        Mobile[] mobiles = new Mobile[5];
        for(int i = 0; i < 5; i++){
            laptops[i] = new Laptop("Laptop"+i, 100000.0);
            mobiles[i] = new Mobile("Mobile"+i, 50000.0);
        }
        Salesman salesman = new Salesman("John Doe", 123456789L, "77075434432", LegalType.TOO, 0L, laptops, mobiles);

        // Создаем покупателя
        Buyer buyer = new Buyer("Jane Doe", 987654321L, "77071112233", CardType.VISA, "1234567812345678", 200000.0);

        // Создаем инстанс корзины
        Busket busket = new Busket(buyer);

        // Добавляем товары в корзину
        busket.addLaptop(laptops[0]);
        busket.addMobile(mobiles[0]);

        // Покупатель пытается купить товары
        if (busket.checkout(salesman)) {
            System.out.println("Purchase successful");
        } else {
            System.out.println("Purchase failed");
        }

        // Отчет о продажах
        salesman.report();
    }
}