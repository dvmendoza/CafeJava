package cafejava;

public class cafejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripPrice = 4.0;
        double lattePrice = 5.5;
        double cappuccinoPrice = 4.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
        
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1);// Displays "Welcome to Cafe Java, Cindhuri"
        System.out.println(customer1 + pendingMessage);
    	// ** Your customer interaction print statements will go here ** //
        System.out.println("---------------------------------------");
        
        if(isReadyOrder2) {
        	System.out.println(customer4 + readyMessage);
        	System.out.println(displayTotalMessage +cappuccinoPrice);
        }
        else {
        	System.out.println(customer4 + pendingMessage);
        }
        
        System.out.println("---------------------------------------");
        
        if(isReadyOrder3) {
        	System.out.println(customer2 + readyMessage);
        	System.out.println(displayTotalMessage + lattePrice*2);
        }
        
        else {
        	
        	System.out.println(customer2 + pendingMessage);
        		
        	}
        
        System.out.println("---------------------------------------");
        
        if(isReadyOrder4) {
        	System.out.println(displayTotalMessage + (lattePrice-dripPrice));
        }
	}

}
