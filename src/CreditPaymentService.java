public class CreditPaymentService {
    public int calculate(int loanAmountRub, double interestRate, int paymentPeriodYear) {

        double estimatedMonthlyRate = interestRate / 100 / 12;
        int paymentPeriodMonths = paymentPeriodYear * 12;
        double creditPayment = (loanAmountRub * estimatedMonthlyRate) / (1 - Math.pow((1 + estimatedMonthlyRate), ((-1) * paymentPeriodMonths)));
        return (int) creditPayment;
    }


}
