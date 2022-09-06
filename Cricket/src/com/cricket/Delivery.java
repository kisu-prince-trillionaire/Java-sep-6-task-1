package com.cricket;

public class Delivery {
	public void displayDeliveryDetails(String bowler, String batsman) {
        System.out.println("Bowler is: "+bowler);
        System.out.println("Batsman is: "+batsman);
	}
	public void displayDeliveryDetails(Long runs) {
        if(runs==4) {
            System.out.println("It is a boundary");
        }else if(runs==6) {
            System.out.println("It is a sixer");
        }else {
            System.out.println(runs);
        }
    }
}
	
