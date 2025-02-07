public class Main {

    public static void main(String[] args) {

        // For loop
        for(int counter = 1; counter <= 5; counter++){
            System.out.println("Counter: " + counter);
        }

        for(double i = 2.0; i <= 5.0; i++){
            System.out.println("Calculated "+ i +" interest rate of 10,000 = " + calculateInterest(10_000, i));
        }

        for(double rate = 7.5; rate <= 15.0; rate += 0.25){
            System.out.println("Calculated "+ rate +" interest rate of 10,000 = " + calculateInterest(10_000, rate));
        }
    }

    // Method to calculate an interest amount.
    public static double calculateInterest(double amount, double rate){
        return (amount * (rate/100));
    }


}
