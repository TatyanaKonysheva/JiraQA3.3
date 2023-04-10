public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int result = (int) service.calculate(1_000_000, 9.99, 1);
        System.out.println("Ежемесячный платеж: " + result + " рублей.");

        System.out.println();
        result = (int) service.calculate(1_000_000, 9.99, 2);
        System.out.println("Ежемесячный платеж: " + result + " рублей.");

        System.out.println();
        result = (int) service.calculate(1_000_000, 9.99, 3);
        System.out.println("Ежемесячный платеж: " + result + " рублей.");
    }
}