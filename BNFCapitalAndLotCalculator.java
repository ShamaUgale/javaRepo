package main;

/*
    - This is a Bank Nifty lot calc
    - also calculates the lots and capital calc
    - Start capital is 5000 INR
    - The compounding is done on monthly basis
    - Daily returns is assumed as 10% which is 20 points per per lot
    - On monthly basis we will withdraw 30% of profit and reinvest 70% to the capital for compounding
 */
public class CapitalAndLotCalculator {
    static long initialCapital = 5000;
    static long pointsToBookPerLot = 20;
    static double profitsToBeBookedPerMonth = 0.3;
    static long lotSize = 25;
    static long monthlyWithDrawAmount =0;

    public static int noOfLots(long capital){
        return (int)(capital/5000);
    }

    public static void compoundingPerMonth(long capital){
        long dailyProfit = noOfLots(capital) * lotSize * pointsToBookPerLot;
        long monthlyInitialCapital = initialCapital;
        long monthlyProfit = 0;
        for(int i=1; i<=12; i++) {
            System.out.println("Number of lots to be traded in month "+ i + " is : " + noOfLots(monthlyInitialCapital));
            for (int j = 1; j <= 20; j++) {
                System.out.println("Day " + j + " profit is: " + dailyProfit);
                monthlyProfit = dailyProfit + monthlyProfit;
            }
            System.out.println("Month "+ i + " profit is : " + monthlyProfit);
            monthlyWithDrawAmount = (long) ((monthlyProfit + monthlyInitialCapital) * profitsToBeBookedPerMonth) + (monthlyInitialCapital % 5000 );
            monthlyInitialCapital = (long) ((monthlyProfit + monthlyInitialCapital) - monthlyWithDrawAmount);
            long extraBonusMoneyForWithdrawal = (monthlyInitialCapital % 5000);
            monthlyWithDrawAmount = monthlyWithDrawAmount + extraBonusMoneyForWithdrawal;
            System.out.println("Your month " + i + " income is : " + monthlyWithDrawAmount);
            monthlyInitialCapital = monthlyInitialCapital - extraBonusMoneyForWithdrawal;
            System.out.println("Month " + i + " capital is: " + monthlyInitialCapital);
            dailyProfit = noOfLots(monthlyInitialCapital) * lotSize * pointsToBookPerLot;
            System.out.println("********************************************************");
            monthlyProfit = 0;
        }
    }

    public static void main(String[] args) {
        compoundingPerMonth(initialCapital);
    }
}
