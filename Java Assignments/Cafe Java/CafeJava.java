public class CafeJava {
    public static void main(String[] args) {

        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        String greetingAgain = "Welcome again, ";
        String mistakeApology = "Sorry for the mistake..";
        String priceChanges = "You owe us $";
        String byeGreeting = "Welcome and Enjoy your day!";
        

        double dripCoffeePrice = 4.6;  // price changed from 2.3 to 4.6
        double lattePrice = 7.2; // price changed from 4.2 to 7.8
        double cappuccinoPrice = 5.5;  // price changed from 3.8 to 5.5

        String customer1 = "Sally";
        String customer2 = "Ahmad";
        String customer3 = "Adam";


        boolean isReadyOrder1 = true; // changed from false to true.
        boolean isReadyOrder2 = false; // changed from true to false.
        boolean isReadyOrder3 = true; // changed from false to true.
    
        //Sally ordered Coffee..
        System.out.println(generalGreeting + customer1);
        if (isReadyOrder1){
            System.out.println(customer1 + readyMessage);
            System.out.println(displayTotalMessage + dripCoffeePrice);
        } else {
            System.out.println(customer1 + pendingMessage);
        }

        //Ahmad ordered cappuccino..
        System.out.println(generalGreeting + customer2);
        if (isReadyOrder2){
            System.out.println(customer2 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        } else {
            System.out.println(customer2 + pendingMessage);
        }
        
        //Sally ordering 2 lattes.
        System.out.println(generalGreeting + customer1);
        if (!isReadyOrder1){
            System.out.println(customer1 + readyMessage);
            System.out.println(displayTotalMessage + (lattePrice + lattePrice));
        } else {
            System.out.println(customer1 + pendingMessage);
        }

        //Adam's issue..
        System.out.println(greetingAgain + customer3);
        if (!isReadyOrder3){
            System.out.println(customer3 + readyMessage);
            System.out.println(mistakeApology);
            System.out.println(priceChanges + (lattePrice - dripCoffeePrice));
            System.out.println(byeGreeting + customer3);
        } else {
            System.out.println (customer3 + pendingMessage);
        }
        


    }
}