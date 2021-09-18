package com.closets;

public class GarageroomCloset implements Order {
	
	private Closets closets;

	public GarageroomCloset(Closets closets) {
    	this.closets = closets;
    }

	@Override
	public void execute() {
		closets.GarageroomClosets();

	}

}
