package com.closets;

public class ClosetCommandBuildPattern {

	public static void main(String[] args) {
		
		Closets closets = new Closets();
		
		BasementCloset basement = new BasementCloset(closets);
		BedroomCloset basement1 = new BedroomCloset(closets);
		GarageroomCloset basement2 = new GarageroomCloset(closets);
		LivingroomCloset basement3 = new LivingroomCloset(closets);
		LaundryroomCloset basement4 = new LaundryroomCloset(closets);
		
		ClosetOrder closetOrder = new ClosetOrder();
		closetOrder.addItem(basement);
		closetOrder.addItem(basement1);
		closetOrder.addItem(basement2);
		closetOrder.addItem(basement3);
		closetOrder.addItem(basement4);
		
		closetOrder.removeItem();

	}

}
