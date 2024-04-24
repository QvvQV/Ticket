public class Main {
    public static void main(String[] args) {

        int ticketPrice = 13_676; //стоимость билета

        int bonusMiles = ticketPrice / 20; //количество миль за каждые 20 рублей

        System.out.println("За покупку билета на сумму " + ticketPrice + " руб. Ваш бонус составит " + bonusMiles + " бонусных миль.");

    }
}